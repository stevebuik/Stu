(ns stu.d3
  (:require
    [goog.string :as gstring]
    [goog.string.format]                                    ; required or release compile will generate invalid js
    ["react-faux-dom" :as faux-dom]
    ["d3/dist/d3.min" :as d3]
    ["react" :as react]
    ["create-react-class" :as create-class]
    [clojure.string :as str]))

(defn size-string
  [i]
  (cond
    (< i 1024) (gstring/format "%f b" i)
    (< i (* 1024 1024)) (gstring/format "%.0f k" (/ i 1024))
    :else (gstring/format "%.1f m" (/ i (* 1024 1024)))))

;;;; CHARTS ;;;;

(def bar-chart-margins {:top 0 :right 20 :bottom 50 :left 70})

(defn bar-chart-horizontal!
  "HOF returning a fn that mutates a dom div, adding a d3 bar chart.
   The data arg is a seq of maps containing :label, :id and value-key used for bar width."
  [svg-width svg-height data {:keys [on-click value-key]
                              :or   {value-key :size}}]
  (fn [chart-div]
    (let [svg (.. d3 (select chart-div)                     ; convert to div to d3
                  (append "svg")
                  (attr "width" svg-width)
                  (attr "height" svg-height))
          width (- svg-width (:left bar-chart-margins) (:right bar-chart-margins))
          height (- svg-height (:top bar-chart-margins) (:bottom bar-chart-margins))
          x (.. d3 scaleLinear
                (domain (clj->js [0 (reduce max (map value-key data))])) ; input
                (range #js [0 width]))                      ; output
          y (.. d3 scaleLinear
                (domain (clj->js [0 (count data)]))
                (range #js [0 height]))
          g (.. svg
                (append "g")
                (attr "class" "chart-container")
                (attr "transform" (str "translate(" (:left bar-chart-margins) "," (:top bar-chart-margins) ")")))
          data-indexed (clj->js (map-indexed #(assoc %2 :position %1) data))
          bars (.. g
                   (selectAll ".bar")
                   (data data-indexed))
          new-bars (.. bars
                       (enter)
                       (append "rect")
                       (attr "class" "bar")
                       (attr "x" 0)
                       (attr "y" (fn [d] (y (.-position d)))) ; use index for y position
                       (attr "width" (fn [d i]
                                       (x (aget d (name value-key)))))
                       (attr "height" (- (/ height (count data)) 1)))]

      ; add click handler to bars when present
      (when on-click
        (.. new-bars
            (on "click" on-click)))

      ; x-axis
      (.. g
          (append "g")
          (attr "transform" (str "translate(0," height ")"))
          (call (.. d3
                    (axisBottom x)
                    (ticks 5)
                    (tickFormat size-string)))
          ; rotate labels
          (selectAll "text")
          (attr "x" 10)
          (attr "y" 5)
          (attr "transform" "rotate(60)")
          (style "text-anchor" "start"))

      ; y-axis
      (.. g
          (append "g")
          (call (.. d3
                    (axisLeft y)
                    (ticks (count data))
                    (tickSize 0)                            ; don't show tick lines
                    (tickPadding 5)                         ; space to left and right of tick labels
                    (tickFormat (fn [i] (get-in data [i :label])))))
          (selectAll "text")
          ; below pushes label down to middle of bar
          (attr "dy" "1.2em")))
    ; return nothing : side-effecting
    nil))

(defn bar-chart-horizontal-transition!
  "generate a d3 transition by using the values. only supports update transitions i.e. no bar adds or removes."
  [data container width scale-key value-key duration]
  (let [connect (.-connectFauxDOM (.-props container))      ; get connect fn from props
        animate (.-animateFauxDOM (.-props container))      ; get animate fn from props
        faux (connect "div" "chart")                        ; re-connect faux dom
        data-indexed (clj->js (map-indexed #(assoc %2 :position %1) data))
        bars (.. d3 (select faux)
                 (selectAll ".bar")
                 (data data-indexed))
        width (- width (:left bar-chart-margins) (:right bar-chart-margins))
        x (.. d3 scaleLinear
              (domain (clj->js [0 (reduce max (map scale-key data))]))
              (range #js [0 width]))]
    (.. bars
        (transition)
        (duration duration)
        (attr "width" (fn [d]
                        (x (aget d (name value-key))))))

    ; re-render of container using faux dom
    (animate duration)))

(defn tree-map-dimensions
  [svg-width svg-height legend-height legend-padding margin]
  (let [legend-width 75
        legend-offset (+ legend-height legend-padding)]
    {:width  (- svg-width (:left margin) (:right margin))
     :height (- svg-height (:top margin) (:bottom margin) legend-offset)}))

(def margin {:top 20 :right 20 :bottom 20 :left 70})
(def legend-width 75)

(defn set-tree-map-node-id!
  "set a hierarical id into a d3 node based on its ancenstors"
  [d]
  (set! (.. d -data -id)
        (str (when (.-parent d)
               (str (.. d -parent -data -id) "."))
             (.. d -data -name))))

(defn data-id
  "return the id from a d3 javascript object"
  [d] (.. d -data -id))

(defn cell-shows-label?
  "predicate true when a tree-map cell should display a label"
  [d]
  (let [width (- (.-x1 d) (.-x0 d))
        height (- (.-y1 d) (.-y0 d))]
    (and (> width 50) (> height 15))))

(defn tree-map!
  "HOF returning a fn that mutates a dom div, adding a d3 tree-map"
  [svg-width svg-height data {:keys [value-key legend-height legend-padding tooltip-content title-string]
                              :or   {value-key       :size
                                     legend-height   20
                                     legend-padding  10
                                     tooltip-content (fn [d]
                                                       "<p>TODO Add content</p>")}}]
  (fn [chart-div]
    ; ported from https://bl.ocks.org/mbostock/4063582
    (let [legend-offset (+ legend-height legend-padding)
          {:keys [width height]} (tree-map-dimensions svg-width svg-height legend-height legend-padding margin)
          color (.. d3
                    (scaleOrdinal d3/schemeCategory10)      ; https://github.com/d3/d3-scale-chromatic
                    (domain (clj->js (map :name (:children data))))) ; set the colors so they can be used in the legend as well
          treemap (.. d3 treemap
                      (tile d3/treemapSquarify)
                      (size (clj->js [width height]))
                      (paddingInner 1))
          root (.. d3
                   (hierarchy (clj->js data))               ; convert to d3 heirarchy object
                   (eachBefore set-tree-map-node-id!)
                   ; set values in heirarchy, using the value-key passed
                   (sum (fn [d] (aget d (name value-key)))))]

      (when title-string
        (.. d3 (select chart-div)
            (append "div")
            (attr "class" "tree-map-title")
            (attr "data-value" (.-value root))
            (text (gstring/format title-string (size-string (.-value root))))))

      (let [svg (.. d3 (select chart-div)
                    (append "svg")
                    (attr "width" svg-width)
                    (attr "height" svg-height))]

        (treemap root)                                      ; perform layout in heirarchy i.e. mutate it

        (let [joined (.. svg
                         (selectAll ".cell")
                         (data (.. root leaves)))
              cells (.. joined
                        (enter)
                        (append "g")
                        (attr "class" "cell")
                        (attr "transform" (fn [d] (str "translate(" (.-x0 d) "," (+ (.-y0 d) legend-offset) ")"))))
              tool (.. d3 (select "#tooltip"))
              rects (.. cells
                        (append "rect")
                        (attr "class" "cell-rect")
                        (attr "id" data-id)
                        (attr "width" (fn [d] (- (.-x1 d) (.-x0 d))))
                        (attr "height" (fn [d] (- (.-y1 d) (.-y0 d))))
                        (attr "fill" (fn [d]                ; parent is foo.bar but we set color domain using "bar" above
                                       (-> (.. d -parent -data -id)
                                           (str/split #"\.") (last)
                                           color)))
                        (on "mousemove" (fn [d]
                                          (.. tool
                                              (style "top" (str (.. d3 -event -pageY) "px"))
                                              (style "left" (str (.. d3 -event -pageX) "px"))
                                              (style "display" "inline-block")
                                              (html (tooltip-content d)))))
                        (on "mouseout" (fn [d]
                                         (.. tool
                                             (style "display" "none")))))]
          ; add text inside g to show a label
          (.. cells
              ;(filter cell-shows-label?)                    ; this is d3/filter, not cljs
              (append "text")
              (attr "class" "cell-text")
              (attr "x" 5)
              (attr "y" 15)
              (text (fn [d] (last (str/split (.. d -data -name) #"/"))))
              (style "opacity" (fn [d] (if (cell-shows-label? d) 1 0)))))

        (let [legend (.. svg
                         (append "g")
                         (selectAll "g")
                         (data (.. color domain)))
              legend-entries (.. legend
                                 (enter)
                                 (append "g")
                                 (attr "class" "legend")
                                 (attr "transform" (fn [d i]
                                                     (str "translate(" (* i legend-width) ", 0)"))))

              legend-rects (.. legend-entries
                               (append "rect")
                               (attr "width" (str legend-width "px"))
                               (attr "height" (str legend-height "px"))
                               (attr "fill" color))

              legend-texts (.. legend-entries
                               (append "text")
                               (attr "x" 5)
                               (attr "y" 15)
                               (text identity))])))

    ; return nothing. side-effecting fn
    nil))

(defn tree-map-transition!
  "generate a d3 transition by using the values. only supports update transitions i.e. no cells adds or removes."
  [data container svg-width svg-height value-key duration {:keys [legend-height legend-padding title-string]
                                                           :or   {legend-height  20
                                                                  legend-padding 10}}]
  (let [connect (.-connectFauxDOM (.-props container))      ; get connect fn from props
        animate (.-animateFauxDOM (.-props container))      ; get animate fn from props
        faux (connect "div" "chart")                        ; re-connect faux dom
        {:keys [width height]} (tree-map-dimensions svg-width svg-height legend-height legend-padding margin)
        legend-offset (+ legend-height legend-padding)
        treemap (.. d3 treemap
                    (tile d3/treemapSquarify)
                    (size (clj->js [width height]))
                    (paddingInner 1))
        root (.. d3 (hierarchy (clj->js data))              ; convert to d3 heirarchy object
                 (eachBefore set-tree-map-node-id!)
                 ; calculate values in hierarchy, using the value-key passed
                 (sum (fn [d] (aget d (name value-key)))))]

    (when title-string
      (let [old-value (.. d3 (select faux)
                          (select ".tree-map-title")
                          (attr "data-value"))
            new-value (.-value root)
            diff (- new-value old-value)]
        (.. d3 (select faux)
            (select ".tree-map-title")
            (attr "data-value" new-value)
            (transition)
            (duration duration)
            (tween "text" (fn []
                            (this-as this
                              (fn [i]
                                (.. d3 (select this)
                                    (text (gstring/format title-string (size-string (+ old-value (* i diff)))))))))))))

    (treemap root)                                          ; calc new layout

    (let [cells (.. d3 (select faux)
                    (selectAll ".cell")                     ; the g container
                    ; re-join the new layout
                    (data (.. root leaves) data-id))]

      ; move the g containers to the new location
      (.. cells
          (transition)
          (duration duration)
          (attr "transform" (fn [d] (str "translate(" (.-x0 d) "," (+ (.-y0 d) legend-offset) ")"))))

      ; concurrently, change the rects
      (let [rects-updated (.. d3 (select faux)
                              (selectAll ".cell-rect")      ; the rects
                              ; re-join the new layout
                              (data (.. root leaves) data-id))]

        (.. rects-updated
            (transition)
            (duration duration)
            (attr "width" (fn [d] (- (.-x1 d) (.-x0 d))))
            (attr "height" (fn [d] (- (.-y1 d) (.-y0 d))))
            ; TODO find a way to do this with an opacity transition
            (on "start" (fn [d i]
                          (this-as this
                            (let [new-opacity (if (cell-shows-label? d) 1 0)]
                              (.. d3 (select (.-parentNode this)) ; need parent since text is sibling of rect
                                  (select ".cell-text")
                                  (style "opacity" new-opacity)))))))))

    ; re-render of container using faux dom
    (animate duration)))

;;;; UTILS ;;;;

; hinted fns to block munging for the custom props i.e. avoid need for externs
(defn- duration [^js props] (.-animateDuration props))
(defn- mutations [^js props] (.-d3fn props))
(defn- containerCallback [^js props] (.-containerCallback props))
(defn- chart [^js props] (.-chart props))

(def Container
  (create-class
    #js {:componentDidMount (fn []
                              (this-as this
                                (let [connect (.-connectFauxDOM (.-props this))
                                      animate (.-animateFauxDOM (.-props this))
                                      animation-duration (duration (.-props this))
                                      callback (containerCallback (.-props this))
                                      d3-mutations (mutations (.-props this))]

                                  ; callback to parent component to provide access for updates
                                  (when callback (callback this))

                                  ; create the faux div and store in the "chart" prop
                                  (let [faux (connect "div" "chart")]

                                    ; mutations might be delayed so being defensive
                                    (when d3-mutations (d3-mutations faux)))

                                  ; initial animate if required
                                  (when animation-duration (animate animation-duration))

                                  nil)))
         :render            (fn []
                              (this-as this
                                (if-let [c (chart (.-props this))]
                                  c                         ; return the faux node when present
                                  ; otherwise create a div so that something is always returned by render
                                  (.createElement react "div" #js {:className "placeholder"}))))}))

(defn container
  "create a plain component using a faux dom and a fn to mutate that dom.
   the props must contain a :d3fn arity-1 fn that performs the d3 mutation"
  [props]
  (.createElement react (faux-dom/withFauxDOM Container) (clj->js props)))

