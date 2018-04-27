(ns stu.cards-d3
  (:require
    [goog.string :as gstring]
    [goog.string.format]                                    ; required or release compile will generate invalid js
    [reagent.core :as r]
    [devcards.core :as dc :include-macros true :refer-macros [defcard defcard-doc deftest]]
    [stu.d3 :as d3]))

(defcard-doc
  "
  ## D3 charts with transitions
  ")

(defn stateful-bar-chart
  "a reagent component with enough state to demo d3 transitions"
  [data]
  (let [click-handler (fn [d]
                        (this-as this
                          (js/console.log d)))
        width 600
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
           (r/as-element [stateful-bar-chart data])))

(defn tree-tooltip
  [d]
  (let [data (.-data d)]
    (gstring/format "<p>%s</p><p>Size: %s</p><p>Before: %s</p>"
                    (.-name data)
                    (d3/size-string (aget data "size"))
                    (d3/size-string (aget data "size-uncompiled")))))

(defn stateful-tree-map
  [data]
  (let [opts {:title-string    "Module : fake ( %s )"
              :tooltip-content tree-tooltip}
        state (r/atom {:key :size})
        chart-element (d3/container {:d3fn              (d3/tree-map! 800 300 data opts)
                                     :containerCallback (fn keep-container-reference
                                                          [chart-container]
                                                          (swap! state assoc :container chart-container))})]
    ; use watch to detect change since it exposes old and new state values
    (add-watch state :change (fn [k s old new]
                               (when (not= (:key old) (:key new))
                                 (d3/tree-map-transition! data (:container @state) 800 300 (:key @state) 2000 opts))))
    (fn [data]
      (r/create-class
        {:reagent-render (fn []
                           [:div {}
                            [:div {} "Chart showing: " (name (:key @state))]
                            [:button {:onClick (fn [_]
                                                 (swap! state assoc :key (if (= :size (:key @state))
                                                                           :size-uncompiled
                                                                           :size)))}
                             "toggle"]
                            [:div {} chart-element]])}))))

(defcard tree-map
         (let [data {:name     "flare"
                     :children [{:name     "analytics"
                                 :children [{:name "agg" :size 2000 :size-uncompiled 2000}
                                            {:name "comm" :size 3000 :size-uncompiled 3000}
                                            {:name "heir" :size 400 :size-uncompiled 4000}
                                            {:name "merge" :size 3000 :size-uncompiled 300}]}
                                {:name     "perf"
                                 :children [{:name "css" :size 200 :size-uncompiled 6000}
                                            {:name "images" :size 8000 :size-uncompiled 15000}]}]}]
           (r/as-element [stateful-tree-map data])))


