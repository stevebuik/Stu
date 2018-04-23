(ns stu.illuminate
  (:require
    [clojure.pprint :refer [pprint]]
    [me.raynes.fs :as fs]
    [clojure.spec.alpha :as s]
    [viz.core :as viz]
    [clojure.edn :as edn]
    [clojure.data.json :as json]
    [cognitect.transit :as transit]
    [clojure.string :as str])
  (:import (java.io ByteArrayOutputStream)))

(defn top-level
  [node]
  (-> (:name node)
      (str/split #"/")
      first))
(s/fdef top-level
        :args (s/cat :node ::viz/node))

; TODO multiple modules per bundle when code splitting in place
(defn shadow-bundle->tree
  [bundle]
  (->> bundle
       :build-modules
       first
       :source-bytes
       (mapv (fn [[resource-name size]]
               {:name resource-name :size (int (/ size 1024))}))
       (remove #(zero? (:size %)))                          ; don't show items < 1k
       (sort-by :name)
       (group-by top-level)
       (mapv (fn top-level-node
               [[k v]]
               {:name     k
                :children v}))
       (hash-map :name "app" :children)))
(s/fdef shadow-bundle->tree
        :args (s/cat :bundle map?)
        :ret ::viz/tree)

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
        :ret ::viz/snapshot)

(defn shadow-bundle->summary
  [file-name]
  (let [parsed (edn/read-string (slurp file-name))]
    {:id    (parent-dir file-name)
     :label (parent-dir file-name)
     :when  (fs/mod-time file-name)
     :value (int (/ (get-in parsed [:build-modules 0 :js-size]) 1024))}))
(s/fdef shadow-bundle->summary
        :args (s/cat :file-name string?)
        :ret ::viz/summary)

(defn spit-viz!
  [title summaries snapshots file-name]
  (let [template-contents (slurp "resources/viz-host-page.html")
        ; app script in this case is app + a new source
        app-script-contents (slurp "resources/viz-app-release.js")
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
                          (str/replace "***title***" title)
                          (str/replace "***summaries***" (json/write-str summaries))
                          (str/replace "***snapshots***" (json/write-str snapshots-as-transit)))]
    (spit file-name full-contents)))
(s/fdef spit-viz!
        :args (s/cat :summaries ::viz/summaries
                     :snapshots (s/map-of ::viz/id ::viz/snapshot)
                     :file-name string?))

(defn generate-shadow-viz!
  [snapshots-dir file-name {:keys [title]}]
  (let [releases (->> (fs/list-dir snapshots-dir)
                      (sort-by fs/mod-time)
                      reverse)
        with-bundle-file #(str % "/bundle-info.edn")
        id-from-path #(last (str/split (str %) #"/"))
        summaries (->> releases
                       (map with-bundle-file)
                       (mapv shadow-bundle->summary))
        snapshot-map (->> releases
                          (map (fn [release-dir]
                                 [(id-from-path release-dir)
                                  (shadow-bundle->snapshot (with-bundle-file release-dir))]))
                          (into {}))]
    (spit-viz! title summaries snapshot-map "resources/public/stu-builds.html")))

(defn generate-sample!
  []
  (generate-shadow-viz! ".shadow-cljs/release-snapshots/app" "resources/public/stu-builds.html" {:title "Stu App Sizes"}))

(defn shadow [& args]
  (generate-shadow-viz! (first args) (second args) (apply hash-map (drop 2 args))))