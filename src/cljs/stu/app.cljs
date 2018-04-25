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

(defn- bar-chart!
  "return a map containing a spec explain for summaries and a bar chart faux container if valid
   side-effect is app-state is updated when container is created"
  [snaps app-state]
  (let [explain (s/explain-data ::viz/summaries snaps)]
    (cond-> {:snaps-explain explain}
            (nil? explain)
            (merge
              ; each snapshot has N modules. need a single value for the bar chart
              (let [snaps-for-bar-chart (->> snaps
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
                    bar-chart-width 200
                    bar-chart-height (+ 50 (* 20 (count snaps)))
                    ; the mutation fn for the initial bar chart render
                    bar-chart-d3 (d3/bar-chart-horizontal! bar-chart-width bar-chart-height
                                                           snaps-for-bar-chart
                                                           {:on-click  (fn [e]
                                                                         (swap! app-state assoc :snapshot/id (.-id e)))
                                                            :value-key (:bar-chart-key @app-state)})
                    ; creating the container once since d3 faux dom/state needs to persist between renders
                    bar-chart-singleton (d3/container {:d3fn bar-chart-d3
                                                       :containerCallback
                                                             (fn keep-container-reference
                                                               [chart-container]
                                                               (swap! app-state assoc :bar-chart-container chart-container))})]
                {:snaps-for-bar-chart snaps-for-bar-chart
                 :bar-chart-width     bar-chart-width
                 :bar-chart-height    bar-chart-height
                 :bar-chart-singleton bar-chart-singleton})))))

(defn app-component
  "return a react component which shows the timeline and size chart"
  [source {:keys [fixed-bars?]
           :or   {fixed-bars? true}}]
  (let [snaps (snapshots source)
        app-state (r/atom {:snapshot/id   (:id (first snaps)) ; default to showing the most recent snapshot
                           :bar-chart-key :size})
        {:keys [bar-chart-singleton bar-chart-width bar-chart-height snaps-for-bar-chart snaps-explain]}
        (bar-chart! snaps app-state)]
    (r/create-class
      {:component-did-mount  (fn [this]
                               ; IDIOMATIC? is there a better way to measure size and pass to child?
                               (js/setTimeout
                                 (fn []
                                   ; measure the container so that re-render will know the width
                                   (let [rect (.getBoundingClientRect (r/dom-node this))]
                                     (swap! app-state merge {:container/width  (.-width rect)
                                                             :container/height (.-height rect)})))
                                 100))
       :component-did-update (fn [_]
                               (when-let [container (:bar-chart-container @app-state)]
                                 (d3/bar-chart-horizontal-transition! snaps-for-bar-chart
                                                                      container
                                                                      bar-chart-width
                                                                      bar-chart-height
                                                                      :size
                                                                      (:bar-chart-key @app-state)
                                                                      1000)))
       :reagent-render       (fn [source]
                               ;(js/console.log ["rendering"])
                               (let [title (title source)
                                     legend-padding 10
                                     legend-height 20
                                     width (:container/width @app-state)
                                     bar-chart-visible? (> (count snaps) 1)
                                     chart-sizes {:tree-width (if bar-chart-visible?
                                                                (- width 250)
                                                                width)}]
                                 (if snaps-explain
                                   [:div {}
                                    "Invalid summary data!"
                                    [:p {} snaps-explain]]
                                   [:div {}
                                    [:h3 {:style {:width  (str (count title) "rem")
                                                  :margin "1rem auto"}} title]
                                    [:div {}

                                     (when bar-chart-visible?
                                       [:div {:style {:float "left"
                                                      :width "210px"}}
                                        [:br {}]            ; need content to keep the float left while fixed
                                        [:div {:style (if fixed-bars? {:position "fixed"
                                                                       :top      "80px"
                                                                       :left     "0px"}
                                                                      {})}
                                         [:div {:style {:marginLeft   "20px"
                                                        :marginBottom "20px"}}
                                          [:h4 {} "Builds"]
                                          [:div {:className "compression-toggle"}
                                           [:label {:className "switch"}
                                            [:input {:type     "checkbox"
                                                     :checked  (= :size-compressed (:bar-chart-key @app-state))
                                                     :onChange (fn [e]
                                                                 (swap! app-state assoc :bar-chart-key
                                                                        (get {:size            :size-compressed
                                                                              :size-compressed :size}
                                                                             (:bar-chart-key @app-state))))}]
                                            [:span {:className "slider round"}]]
                                           [:label {:className "label"}
                                            (get {:size            "Uncompressed"
                                                  :size-compressed "Compressed"} (:bar-chart-key @app-state))]]]

                                         [:div {} bar-chart-singleton]]])

                                     [:div {:style {:float "left"}}
                                      (if width
                                        (let [snap (snapshot source (:snapshot/id @app-state))
                                              tooltip (fn [d]
                                                        (gstring/format "<p>%s</p><p>Compiled: %s</p>"
                                                                        (.. d -data -name)
                                                                        (d3/size-string (.. d -data -size))))]
                                          (if-let [snap-explain (s/explain-data ::viz/snapshot snap)]
                                            [:div {} "Invalid snapshot data"
                                             [:p {} snap-explain]]
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
                                                                                   :tooltip-content tooltip})})])))
                                        [:div {} "Loading.."])]
                                     [:div {:style {:clear "both"}}]]])))})))

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
  (r/render [app-component (source-from-globals) {}]
            (js/document.getElementById "app")))
