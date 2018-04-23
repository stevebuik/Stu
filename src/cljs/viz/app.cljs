(ns viz.app
  (:require
    [reagent.core :as r]
    [viz.core :as viz]
    [viz.d3 :as d3]
    [clojure.spec.alpha :as s]
    [cognitect.transit :as transit]))

(defprotocol Source
  (title [this])
  (snapshots [this])                                        ; a sorted (:generated desc) seq of snapshot-summary
  (snapshot [this id]))                                     ; a snapshot

(defn app-component
  "return a react component which shows the timeline and size chart"
  [source]
  (let [snaps (snapshots source)
        app-state (r/atom {:snapshot/id (:id (first snaps))})] ; default to showing the most recent snapshot
    (r/create-class                                         ; form 3 component
      {:component-did-mount
       (fn [this]
         (let [rect (.getBoundingClientRect (r/dom-node this))]
           (js/setTimeout                                   ; hack to measure the container
             #(swap! app-state merge {:container/width  (.-width rect)
                                      :container/height (.-height rect)})
             100)))
       :reagent-render
       (fn [source]
         (let [title (title source)
               legend-padding 10
               legend-height 20
               width (:container/width @app-state)
               bar-chart-visible? (> (count snaps) 1)
               chart-sizes {:bar-width  200
                            :tree-width (if bar-chart-visible?
                                          (- width 250)
                                          width)}]
           (if width
             (if-let [explain (s/explain-data ::viz/summaries snaps)]
               [:div {}
                "Invalid summary data!"
                [:p {} explain]]
               [:div {}
                [:h3 {:style {:width  (str (count title) "rem")
                              :margin "1rem auto"}} title]
                (when bar-chart-visible?
                  [:div {:style {:float       "left"
                                 :marginRight "1rem"
                                 :marginTop   (str (+ legend-height legend-padding) "px")}}
                   (let [click-handler (fn [e]
                                         (swap! app-state assoc :snapshot/id (.-id e)))
                         chart (d3/bar-chart-horizontal! (:bar-width chart-sizes) (+ 50 (* 20 (count snaps)))
                                                         (mapv (fn [snap] (update snap :when #(js/Date. %))) snaps)
                                                         {:on-click click-handler})]
                     [:div {}
                      [:style {} ".bar {fill: steelblue;} .bar:hover {fill: brown;cursor:pointer;}"]
                      (d3/container {:d3fn            chart
                                     :animateDuration 1000})])])
                [:div {:style {:float "left"}}
                 (let [snap (snapshot source (:snapshot/id @app-state))]
                   (if-let [explain (s/explain-data ::viz/snapshot snap)]
                     [:div {} "Invalid snapshot data"
                      [:p {} explain]]
                     (d3/container {:d3fn (d3/tree-map! (:tree-width chart-sizes)
                                                        (int (* (:tree-width chart-sizes) .6))
                                                        (:tree snap)
                                                        {:legend-padding legend-padding
                                                         :legend-height  legend-height})})))]
                [:div {:style {:clear "both"}}]])
             [:div {} "Loading.."])))})))

(defrecord GlobalsSource [title summaries snapshots]
  Source
  (title [this] title)
  (snapshots [this] summaries)
  (snapshot [this id] (let [reader (transit/reader :json)]
                        (transit/read reader (get snapshots id)))))

(defn source-from-globals
  []
  (map->GlobalsSource {:title     js/title
                       :summaries (js->clj js/summaries :keywordize-keys true)
                       :snapshots (js->clj js/snapshots)}))

(defn ^:export init []
  (r/render [app-component (source-from-globals)]
            (js/document.getElementById "app")))
