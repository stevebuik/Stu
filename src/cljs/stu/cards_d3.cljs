(ns stu.cards-d3
  (:require
    [reagent.core :as r]
    [devcards.core :as dc :include-macros true :refer-macros [defcard defcard-doc deftest]]
    [stu.d3 :as d3]
    ["react" :as react]))

(defcard-doc
  "
  ## D3 charts standalone
  ")

(defcard bar-chart
         (let [data (map-indexed (fn [i d] {:id    i
                                            :label (str "release-" d)
                                            :size  (+ 3000 d)})
                                 (take 10 (repeatedly #(rand-int 2500))))
               click-handler (fn [d]
                               (js/console.log d))]
           (r/as-element
             [:div {}
              (d3/container {:d3fn            (d3/bar-chart-horizontal! 500 200 data
                                                                        {:on-click click-handler})
                             ; below means the loading transition must complete in 1sec
                             :animateDuration 1000})])))

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


