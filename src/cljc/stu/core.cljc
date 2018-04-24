(ns stu.core
  (:require
    #?(:clj
        [clojure.spec.alpha :as s]
       :cljs [cljs.spec.alpha :as s])))

(s/def ::module-id keyword?)
(s/def ::size int?)
(s/def ::size-compressed int?)

(s/def ::module (s/keys :req-un [::module-id ::size ::size-compressed]))
(s/def ::modules (s/coll-of ::module :kind vector?))

(s/def ::id string?)
(s/def ::label string?)
(s/def ::when number?)                                      ; millis past epoch

(s/def ::summary (s/keys :req-un [::id ::label ::when ::modules]))

(s/def ::summaries (s/coll-of ::summary :min-count 1))

(s/def ::name string?)
(s/def ::size int?)
(s/def ::size-before int?)                                  ;  this is the js-size i.e. size before Google Closure optimisation

(s/def ::children (s/coll-of ::node :kind vector?))         ; recursive spec

(s/def ::node (s/keys :req-un [::name]
                      :opt-un [::size ::size-before ::children]))

(s/def ::tree ::node)
(s/def ::snapshot-module (s/keys :req-un [::id ::label ::size ::size-before ::tree]))

(s/def ::snapshot (s/coll-of ::snapshot-module :kind vector? :min-count 1))

(comment
  (s/explain-data ::summaries [{:id      "123"
                                :label   "snap1"
                                :when    (System/currentTimeMillis)
                                :modules [{:module-id       :main
                                           :size            120
                                           :size-compressed 20}]}])

  (s/explain-data ::node {:name "between" :size 3000 :size-before 5000})
  (s/explain-data ::snapshot [{:id          "main"
                               :label       ":main"
                               :when        (System/currentTimeMillis)
                               :size        600000
                               :size-before 900000
                               :tree        {:name     "flare"
                                             :children [{:name     "analytics"
                                                         :children [{:name     "cluster"
                                                                     :children [{:name "agg" :size 2000}
                                                                                {:name "comm" :size 3000}
                                                                                {:name "heir" :size 4000}
                                                                                {:name "merge" :size 3000}]}
                                                                    {:name     "graph"
                                                                     :children [{:name "between" :size 3000}
                                                                                {:name "link" :size 8000}]}]}]}}]))
