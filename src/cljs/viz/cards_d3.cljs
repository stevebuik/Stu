(ns viz.cards-d3
  (:require
    [cljs.pprint :refer [pprint]]
    [devcards.core :as dc
     :include-macros true
     :refer-macros [defcard defcard-doc deftest]]
    [viz.d3 :as d3]))

(defcard-doc
  "
  ## D3 charts standalone
  ")

(defcard tree-map
         (let [data {:name     "flare"
                     :children [{:name     "analytics"
                                 :children [{:name     "cluster"
                                             :children [{:name "agg" :size 2000}
                                                        {:name "comm" :size 3000}
                                                        {:name "heir" :size 4000}
                                                        {:name "merge" :size 3000}]}
                                            {:name     "graph"
                                             :children [{:name "between" :size 3000}
                                                        {:name "link" :size 8000}]}]}]}
               opts {}]
           (d3/container {:d3fn            (d3/tree-map! 800 300 data opts)
                          ; below means all transitions in the treemap! fn must complete in 1sec
                          :animateDuration 1000})))


