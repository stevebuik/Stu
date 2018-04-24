(ns stu.app
  (:require
    [goog.string :as gstring]
    [goog.string.format]                                    ; required or release compile will generate invalid js
    [reagent.core :as r]
    [stu.core :as viz]
    [stu.d3 :as d3]
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
                         snaps-for-bar-chart (->> snaps
                                                  (mapv (fn convert-date [snap]
                                                          (update snap :when #(js/Date. %))))
                                                  (mapv (fn sum-module-sizes [snap]
                                                          (-> snap
                                                              (merge {:size            (->> (:modules snap)
                                                                                            (map :size)
                                                                                            (reduce +))
                                                                      :size-compressed (->> (:modules snap)
                                                                                            (map :size-compressed)
                                                                                            (reduce +))})
                                                              (dissoc :modules)))))
                         chart (d3/bar-chart-horizontal! (:bar-width chart-sizes) (+ 50 (* 20 (count snaps)))
                                                         snaps-for-bar-chart
                                                         {:on-click  click-handler
                                                          :value-key :size})]
                     [:div {}
                      (d3/container {:d3fn            chart
                                     :animateDuration 1000})])])
                [:div {:style {:float "left"}}
                 (let [snap (snapshot source (:snapshot/id @app-state))
                       tooltip (fn [d]
                                 (gstring/format "<p>%s</p><p>Compiled: %s</p>"
                                                 (.. d -data -name)
                                                 (d3/size-string (.. d -data -size))))]
                   (if-let [explain (s/explain-data ::viz/snapshot snap)]
                     [:div {} "Invalid snapshot data"
                      [:p {} explain]]
                     (for [module snap]
                       [:div {:key (:id module)}
                        [:h3 {} (gstring/format "Module: %s ( %s )"
                                                (:label module)
                                                (d3/size-string (:size module)))]
                        (d3/container {:d3fn (d3/tree-map! (:tree-width chart-sizes)
                                                           (int (* (:tree-width chart-sizes) .6))
                                                           (:tree module)
                                                           {:legend-padding  legend-padding
                                                            :legend-height   legend-height
                                                            :tooltip-content tooltip})})])))]
                [:div {:style {:clear "both"}}]])
             [:div {} "Loading.."])))})))

(defn- parsed-transit
  [s]
  (let [reader (transit/reader :json)]
    (transit/read reader s)))

(defrecord GlobalsSource [title summaries snapshots]
  Source
  (title [this] title)
  (snapshots [this] summaries)
  (snapshot [this id] (parsed-transit (get snapshots id))))

(defn source-from-globals
  "return a source that de-couples the data from the app code by loading it from global js vars in the host page.
  this allows generated data to be combined with app code to make a standalone html page."
  []
  (map->GlobalsSource {:title     js/title
                       :summaries (parsed-transit js/summaries)
                       :snapshots (js->clj js/snapshots)}))

(defn ^:export init []
  (r/render [app-component (source-from-globals)]
            (js/document.getElementById "app")))
