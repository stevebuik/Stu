(ns stu.cards-d3
  (:require
    [reagent.core :as r]
    [devcards.core :as dc :include-macros true :refer-macros [defcard defcard-doc deftest]]
    [stu.d3 :as d3]))

(defcard-doc
  "
  ## D3 charts with transitions
  ")

(defn bar-container
  "a reagent component with enough state to demo d3 transitions"
  [data]
  (let [click-handler (fn [d]
                        (this-as this
                          (js/console.log d)))
        width 500
        height 200
        state (r/atom {:key :size})
        ; create the d3 element outside of render since it holds the faux dom in its state
        ; and that is re-used by transitions
        chart-element (d3/container {:d3fn              (d3/bar-chart-horizontal! width
                                                                                  height
                                                                                  data
                                                                                  {:on-click  click-handler
                                                                                   :value-key (:key @state)})
                                     :containerCallback (fn keep-container-reference
                                                          [chart-container]
                                                          (swap! state assoc :container chart-container))})]
    (fn [data]
      (r/create-class
        {:component-did-update (fn [_]
                                 (d3/bar-chart-horizontal-transition! data
                                                                      (:container @state)
                                                                      width
                                                                      height
                                                                      (:key @state)
                                                                      (:key @state)
                                                                      1000))
         :reagent-render       (fn []
                                 [:div {}
                                  [:div {} "Chart showing: " (name (:key @state))]
                                  [:button {:onClick (fn [_]
                                                       (swap! state assoc :key (if (= :size (:key @state))
                                                                                 :size-compressed
                                                                                 :size)))}
                                   "toggle"]
                                  [:div {} chart-element]])}))))

(defcard bar-chart
         (let [data (map-indexed (fn [i d] {:id              i
                                            :label           (str "release-" d)
                                            :size            (+ 3000 d)
                                            :size-compressed d})
                                 (take 10 (repeatedly #(rand-int 2500))))]
           (r/as-element [bar-container data])))

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


