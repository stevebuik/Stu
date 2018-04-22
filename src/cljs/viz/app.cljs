(ns viz.app
  (:require
    [cljs.pprint :refer [pprint]]
    [reagent.core :as r]
    [viz.d3 :as d3]))

(defprotocol Source
  (snapshots [this])                                        ; a sorted (:generated desc) seq of snapshot-summary
  (snapshot [this id]))                                     ; a snapshot

; TODO specs

(defn app-component
  "return a react component which shows the timeline and size chart"
  [source title]
  (let [snaps (snapshots source)
        app-state (r/atom {:snapshot/id (:id (first snaps))})] ; default to showing the most recent snapshot
    (fn [source title]
      [:div {}
       [:h3 {} title]
       [:div {:style {:float       "left"
                      :marginRight "1rem"}}
        (let [click-handler (fn [e]
                              (swap! app-state assoc :snapshot/id (.-id e)))
              chart (d3/bar-chart-horizontal! 200 300
                                              snaps
                                              {:on-click click-handler})]
          [:div {}
           [:style {} ".bar {fill: steelblue;} .bar:hover {fill: brown;cursor:pointer;}"]
           (d3/container {:d3fn            chart
                          :animateDuration 1000})])]
       [:div {:style {:float "left"}}
        (let [snap (snapshot source (:snapshot/id @app-state))]
          (d3/container {:d3fn (d3/tree-map! 600 350 (:data snap) {})}))]
       [:div {:style {:clear "both"}}]])))

(defn ^:export init []
  (pprint "start the engines"))
