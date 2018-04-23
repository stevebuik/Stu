(ns stu.core
  (:require
    #?(:clj
        [clojure.spec.alpha :as s]
       :cljs [cljs.spec.alpha :as s])))

(s/def ::id string?)
(s/def ::label string?)
(s/def ::when number?)                                      ; millis past epoch
(s/def ::value int?)

(s/def ::summary (s/keys :req-un [::id ::label ::when ::value]))

(s/def ::summaries (s/coll-of ::summary :min-count 1))

(s/def ::name string?)
(s/def ::size int?)
(s/def ::children (s/coll-of ::node :kind vector?))         ; recursive spec

(s/def ::node (s/keys :req-un [::name]
                      :opt-un [::size ::children]))

(s/def ::tree ::node)
(s/def ::snapshot (s/keys :req-un [::id ::label ::when ::tree]))

(comment
  (s/explain-data ::summaries [{:id    "123"
                                :label "snap1"
                                :when  (System/currentTimeMillis)
                                :value 120}])

  (s/explain-data ::node {:name "between" :size 3000})
  (s/explain-data ::snapshot {:id    "123"
                              :label "snap1"
                              :when  (System/currentTimeMillis)
                              :tree  {:name     "flare"
                                      :children [{:name     "analytics"
                                                  :children [{:name     "cluster"
                                                              :children [{:name "agg" :size 2000}
                                                                         {:name "comm" :size 3000}
                                                                         {:name "heir" :size 4000}
                                                                         {:name "merge" :size 3000}]}
                                                             {:name     "graph"
                                                              :children [{:name "between" :size 3000}
                                                                         {:name "link" :size 8000}]}]}]}}))
