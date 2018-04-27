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
  [snaps app-state bar-width]
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
                    bar-chart-height (+ 50 (* 20 (count snaps)))
                    ; the mutation fn for the initial bar chart render
                    bar-chart-d3 (d3/bar-chart-horizontal! bar-width bar-chart-height
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
                 :bar-chart-singleton bar-chart-singleton})))))

(defn tree-tooltip
  [d]
  (gstring/format "<p>%s</p><p>Compiled: %s</p>"
                  (.. d -data -name)
                  (d3/size-string (.. d -data -size))))

(def tree-map-opts {:legend-padding  10
                    :legend-height   20
                    :tooltip-content tree-tooltip})

(defn tree-maps!
  "return a map containing a spec explain for a snapshot and (optionally) a map containing N tree map containers,
   one for each module in the snapshot."
  [snap app-state width height]
  (let [snap-explain (s/explain-data ::viz/snapshot snap)]
    (cond-> {:snap-explain snap-explain}
            (nil? snap-explain)
            (assoc :tree-maps
                   (->> snap
                        (map (fn [module]
                               [(:id module)
                                (d3/container {:d3fn              (d3/tree-map! width height
                                                                                (:tree module)
                                                                                (assoc tree-map-opts
                                                                                  :title-string
                                                                                  (str "Module : " (:id module) " ( %s )")))
                                               :containerCallback (fn keep-container-reference
                                                                    [chart-container]
                                                                    (swap! app-state assoc
                                                                           (keyword "tree-map-container" (:id module))
                                                                           chart-container))})]))
                        (into {}))))))

;;;;;; App component life-cycle ;;;;;;

; app component mounts and async measurement of the dom node occurs
;       - updates the app-state ratom with sizes for the outer hiccup div
;       - causes re-render. hiccup shows "loading" for chart containers since they are not in app-state
;       - creates the d3 containers using sizes derived from dom node size. adds them to app state
;       - causes re-render. hiccup shows charts that are present in app-state
;       - d3 container creation callbacks update the app-state so that containers are available for update/transitions
;       - causes re-render. no-op since nothing has changed
;
; app state changes fire watch on app state atom
;       - fn determines if the update affects any of the d3 charts
;       - if so, invokes a transition on that chart by getting the container from app-state

(defn watch-state-changes
  "respond to state changes that need to cause transitions in the d3 containers"
  [k r old {:keys [:bar-chart-key :tree-map-key] :as new}]

  ; detect bar chart transition
  (when-not (= bar-chart-key (:bar-chart-key old))
    (let [{:keys [:snaps-for-bar-chart :bar-chart-container :bar-chart/width]} new]
      (d3/bar-chart-horizontal-transition! snaps-for-bar-chart
                                           bar-chart-container
                                           width
                                           :size            ; legend key
                                           bar-chart-key    ; value key
                                           1000)))

  ; detect tree-map transition
  (when-not (= tree-map-key (:tree-map-key old))
    ;(js/console.log new)
    (let [{:keys [:source :snapshot/id :tree-maps :tree-map/height :tree-map/width]} new
          snap (snapshot source id)]
      (doseq [module-id (keys tree-maps)]
        (let [module-tree (->> snap
                               (filter #(= module-id (:id %)))
                               first
                               :tree)]
          (d3/tree-map-transition! module-tree
                                   (get new (keyword "tree-map-container" module-id))
                                   width
                                   height
                                   tree-map-key
                                   2000
                                   (assoc tree-map-opts
                                     :title-string
                                     (str "Module : " module-id " ( %s )"))))))))

(defn app-component
  "return a react component which shows the timeline and size chart"
  [source {:keys [fixed-bars?]
           :or   {fixed-bars? true}}]
  (let [snaps (snapshots source)
        app-state (r/atom {:snapshot/id   (:id (first snaps)) ; default to showing the most recent snapshot
                           :source        source
                           :bar-chart-key :size
                           :tree-map-key  :size})
        the-golden-ratio 1.618]
    (add-watch app-state :reagent-change watch-state-changes)
    (r/create-class
      {:component-did-mount (fn [this]
                              ; IDIOMATIC? is there a better way to measure size, uses results and pass results to child?
                              (js/setTimeout
                                (fn []
                                  ; measure the container and update app-state render has access to dimensions
                                  (let [rect (.getBoundingClientRect (r/dom-node this))
                                        app-width (.-width rect)
                                        bar-width 250
                                        bar-margin 50
                                        tree-width (- app-width bar-width bar-margin)
                                        tree-height (/ tree-width the-golden-ratio)]
                                    ; update app-state so that render knows dims for transitions
                                    (swap! app-state merge {:app/width       app-width
                                                            :tree-map/width  tree-width
                                                            :tree-map/height tree-height
                                                            :bar-chart/width bar-width})
                                    ; create chart containers and store in app-state, ready for render
                                    ; will also store the faux dom nodes in app state, ready for transitions
                                    (let [bar-chart-map (bar-chart! snaps app-state bar-width)
                                          tree-maps (tree-maps! (snapshot source (:snapshot/id @app-state))
                                                                app-state
                                                                tree-width
                                                                tree-height)]
                                      (swap! app-state merge bar-chart-map tree-maps))))
                                100))
       :reagent-render      (fn [source]
                              (let [title (title source)
                                    width (:app/width @app-state)
                                    ; no need for bars when a single snapshot is present
                                    bar-chart-visible? (> (count snaps) 1)]
                                (if-let [snaps-explain (:snaps-explain @app-state)]
                                  [:div {}
                                   "Invalid summary data!"
                                   [:p {} snaps-explain]]
                                  [:div {}
                                   [:h3 {:style {:width  (str (count title) "rem")
                                                 :margin "1rem auto"}} title]
                                   [:div {}

                                    (when bar-chart-visible?
                                      [:div {:style {:float "left"
                                                     :width (:bar-chart/width @app-state)}}
                                       [:div {:style {:height "1px"}} ""] ; need content to keep the float left while fixed
                                       [:div {:style (if fixed-bars? {:position "fixed"
                                                                      :top      "80px"
                                                                      :left     "0px"}
                                                                     {})}
                                        [:div {:style {:marginLeft   "20px"
                                                       :marginBottom "20px"}}
                                         [:h4 {} "Builds"]
                                         [:div {:className "toggle"}
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
                                                 :size-compressed "GZipped"} (:bar-chart-key @app-state))]]

                                         [:div {:className "toggle"}
                                          [:label {:className "switch"}
                                           [:input {:type     "checkbox"
                                                    :checked  (= :size (:tree-map-key @app-state))
                                                    :onChange (fn [e]
                                                                (swap! app-state assoc :tree-map-key
                                                                       (get {:size        :size-before
                                                                             :size-before :size}
                                                                            (:tree-map-key @app-state))))}]
                                           [:span {:className "slider round"}]]
                                          [:label {:className "label"}
                                           (get {:size        "Compiled"
                                                 :size-before "Pre-Closure"} (:tree-map-key @app-state))]]]

                                        [:div {}
                                         (if-let [bar-chart (:bar-chart-singleton @app-state)]
                                           bar-chart
                                           "Loading..")]]])

                                    [:div {:style {:float "left"
                                                   :width (:tree-map/width @app-state)}}
                                     (if-let [explain (:snap-explain @app-state)]
                                       [:div {} "Invalid snapshot data"
                                        [:p {} explain]]
                                       (if (empty? (:tree-maps @app-state))
                                         [:div {} "Loading.."]
                                         (for [[id tree] (:tree-maps @app-state)]
                                           [:div {:key id} tree])))]
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
  (let [mount-node (js/document.getElementById "app")]
    (r/render [app-component (source-from-globals) {}] mount-node)))
