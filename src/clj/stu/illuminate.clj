(ns stu.illuminate
  (:require
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

(defn shadow-bundle->tree
  [bundle]
  (->> bundle
       :build-sources
       (mapv (fn [{:keys [resource-name js-size] :as source}]
               {:name resource-name :size (int (/ js-size 1024))}))
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
    {:id    (str (get-in parsed [:build-modules 0 :module-id]))
     :label (parent-dir file-name)
     :when  (fs/mod-time file-name)
     :tree  (shadow-bundle->tree parsed)}))
(s/fdef shadow-bundle->snapshot
        :args (s/cat :file-name string?)
        :ret ::viz/snapshot)

(defn shadow-bundle->summary
  [file-name]
  (let [parsed (edn/read-string (slurp file-name))]
    {:id    (str (get-in parsed [:build-modules 0 :module-id]))
     :label (parent-dir file-name)
     :when  (fs/mod-time file-name)
     :value (int (/ (get-in parsed [:build-modules 0 :js-size]) 1024))}))
(s/fdef shadow-bundle->summary
        :args (s/cat :file-name string?)
        :ret ::viz/summary)

(defn spit-viz!
  [summaries snapshots file-name]
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
                          (str/replace "***summaries***" (json/write-str summaries))
                          (str/replace "***snapshots***" (json/write-str snapshots-as-transit)))]
    (spit file-name full-contents)))
(s/fdef spit-viz!
        :args (s/cat :summaries ::viz/summaries
                     :snapshots (s/map-of ::viz/id ::viz/snapshot)
                     :file-name string?))

(defn generate-shadow-viz!
  [snapshots-dir file-name]
  ; list each snapshot in the dir
  ; map   - transform the bundle file into a ::viz/tree
  ;       - wrap the tree in a ::viz/snapshot map
  ; mapv   - transform each map into a transit string
  ; jsonify the vector
  ; append the json to the static host page and spit to the output file-name
  )

(def latest-bundle ".shadow-cljs/release-snapshots/app/latest/bundle-info.edn")

(defn generate-sample!
  []
  (let [snapshots [(shadow-bundle->snapshot latest-bundle)]
        snapshot-map (->> snapshots
                          (map (juxt :id identity))
                          (into {}))
        summaries [(shadow-bundle->summary latest-bundle)]]
    (spit-viz! summaries snapshot-map "resources/public/stu-builds.html")))

(defn shadow [& args]
  (generate-shadow-viz! (first args) (second args)))