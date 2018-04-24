(ns stu.illuminate
  (:require
    [clojure.pprint :refer [pprint]]
    [me.raynes.fs :as fs]
    [clojure.spec.alpha :as s]
    [stu.core :as stu]
    [clojure.edn :as edn]
    [clojure.data.json :as json]
    [cognitect.transit :as transit]
    [clojure.string :as str]
    [clojure.java.io :as io]
    [clojure.tools.cli :as cli])
  (:import (java.io ByteArrayOutputStream)))

(defn top-level
  [node]
  (-> (:name node)
      (str/split #"/")
      first))
(s/fdef top-level
        :args (s/cat :node ::stu/node))

; TODO multiple modules per bundle when code splitting in place
(defn shadow-bundle->tree
  [bundle]
  (->> bundle
       :build-modules
       first
       :source-bytes
       (mapv (fn [[resource-name size]]
               {:name resource-name :size size}))
       (sort-by :name)
       (group-by top-level)
       (mapv (fn top-level-node
               [[k v]]
               {:name     k
                :children v}))
       (hash-map :name "app" :children)))
(s/fdef shadow-bundle->tree
        :args (s/cat :bundle map?)
        :ret ::stu/tree)

(defn parent-dir
  [file-name]
  (-> (fs/parent file-name)
      str
      (str/split #"/")
      last))

(defn shadow-bundle->snapshot
  [file-name]
  (let [parsed (edn/read-string (slurp file-name))]
    {:id    (parent-dir file-name)
     :label (parent-dir file-name)
     :when  (fs/mod-time file-name)
     :tree  (shadow-bundle->tree parsed)}))
(s/fdef shadow-bundle->snapshot
        :args (s/cat :file-name string?)
        :ret ::stu/snapshot)

(defn shadow-bundle->summary
  [file-name]
  (let [parsed (edn/read-string (slurp file-name))]
    {:id    (parent-dir file-name)
     :label (parent-dir file-name)
     :when  (fs/mod-time file-name)
     :value (get-in parsed [:build-modules 0 :js-size])}))
(s/fdef shadow-bundle->summary
        :args (s/cat :file-name string?)
        :ret ::stu/summary)

(defn load-resource
  "load a resource from the classpath"
  [file-name]
  (->> file-name
       io/resource
       slurp))

(defn spit-viz!
  [title summaries snapshots file-name]
  (let [template-contents (load-resource "stu-host-page.html")
        app-script-contents (load-resource "stu-app-release.js")
        css-contents (load-resource "public/app.css")
        snapshots-as-transit (->> snapshots
                                  (map (fn [[k v]]
                                         ; encode each snapshot as a transit string to minimise chars
                                         (let [out (ByteArrayOutputStream. 4096)
                                               writer (transit/writer out :json)]
                                           (transit/write writer v)
                                           [k (.toString out)])))
                                  (into {}))
        full-contents (-> template-contents
                          (str/replace "***app***" app-script-contents)
                          (str/replace "***css***" css-contents)
                          (str/replace "***title***" title)
                          (str/replace "***summaries***" (json/write-str summaries))
                          (str/replace "***snapshots***" (json/write-str snapshots-as-transit)))]
    (spit file-name full-contents)))
(s/fdef spit-viz!
        :args (s/cat :summaries ::stu/summaries
                     :snapshots (s/map-of ::stu/id ::stu/snapshot)
                     :file-name string?))

(defn generate-shadow-viz!
  [snapshots-dir file-name {:keys [title]}]
  (println (format "Generating %s from %s.." file-name snapshots-dir))
  (let [releases (->> (fs/list-dir snapshots-dir)
                      (sort-by fs/mod-time)
                      reverse)
        with-bundle-file #(str % "/bundle-info.edn")
        id-from-path #(last (str/split (str %) #"/"))
        summaries (->> releases
                       (map with-bundle-file)
                       (filter fs/exists?)                  ; only snapshot dirs should be used e.g. remove .DS_Store
                       (mapv shadow-bundle->summary))
        snapshot-map (->> releases
                          (filter (fn [dir]
                                    (fs/exists? (with-bundle-file dir))))
                          (map (fn [release-dir]
                                 [(id-from-path release-dir)
                                  (shadow-bundle->snapshot (with-bundle-file release-dir))]))
                          (into {}))]
    ; uncomment line(s) below when updating sample-data.cljs
    ;(pprint summaries)
    ;(pprint snapshot-map)
    (spit-viz! title summaries snapshot-map file-name)
    (println "Generation complete.")))

(defn generate-sample!
  []
  (generate-shadow-viz! ".shadow-cljs/release-snapshots/app"
                        "resources/public/stu-builds.html"
                        {:title "Stu App Sizes"}))

(def cli-options [["-d" "--dir DIR" "Shadow CLJS snapshots directory"
                   :default ".shadow-cljs/release-snapshots/app"
                   :validate [(partial fs/exists?) "Invalid snapshots directory"]]
                  ["-f" "--file FILE" "The filename for the generated html page"
                   :default "target/stu.html"
                   :validate [string? "Invalid output file name"]]
                  ["-t" "--title TITLE" "The title displayed in the UI"
                   :default "CLJS Compilations"
                   :validate [string? "Invalid title"]]
                  ["-h" "--help"]])

(defn -main [& args]
  (let [{:keys [options errors] :as opts} (cli/parse-opts args cli-options)]
    (if (:help options)
      (println (str/join \newline ["Run this CLI tool using the following options:"
                                   ""
                                   "-h or --help shows this message"
                                   "-d or --dir <directory> is the directory where Shadow snapshots are read from. defaults to .shadow-cljs/release-snapshots/app"
                                   "-f or --file <file name> is the name of the file to be generated. defaults to target/stu.html"
                                   ""]))
      (if (nil? errors)
        (generate-shadow-viz! (:dir options) (:file options) (dissoc options :dir :file))
        (println ("Invalid options : " errors))))))