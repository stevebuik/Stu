(ns viz.d3
  (:require
    [cljs.pprint :refer [pprint]]
    ["react-faux-dom" :as faux-dom]
    ["d3" :as d3]
    ["react" :as react]
    ["create-react-class" :as create-class]))

;;;; CHARTS ;;;;

(defn bar-chart-horizontal!
  "HOF returning a fn that mutates a dom div, adding a d3 bar chart.
   The data arg is a seq of maps containing :label, :id and :value"
  [svg-width svg-height data {:keys [on-click]}]
  (fn [chart-div]
    (let [svg (.. d3 (select chart-div)
                  (append "svg")
                  (attr "width" svg-width)
                  (attr "height" svg-height))
          margin {:top 20 :right 20 :bottom 50 :left 70}
          width (- svg-width (:left margin) (:right margin))
          height (- svg-height (:top margin) (:bottom margin))
          x (.. d3 scaleLinear
                (domain (clj->js [0 (reduce max (map :value data))])) ; input
                (range #js [0 width]))                      ; output
          y (.. d3 scaleLinear
                (domain (clj->js [0 (count data)]))
                (range #js [0 height]))
          g (.. svg
                (append "g")
                (attr "transform" (str "translate(" (:left margin) "," (:top margin) ")")))
          data-indexed (clj->js (map-indexed #(assoc %2 :position %1) data))]

      (let [bars (.. g
                     (selectAll ".bar")
                     (data data-indexed))
            new-bars (.. bars
                         (enter)
                         (append "rect")
                         (attr "class" "bar")
                         (attr "x" 0)
                         (attr "y" (fn [d] (y (.-position d)))) ; use index for y position
                         (attr "width" 0)                   ; let animation change widths
                         (attr "height" (- (/ height (count data)) 1)))]
        (when on-click
          (.. new-bars
              (on "click" on-click))))

      ; x-axis
      (.. g
          (append "g")
          (attr "transform" (str "translate(0," height ")"))
          (call (.. d3
                    (axisBottom x)
                    (ticks 5)
                    (tickFormat (fn [i] (str i "kb")))))
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
                    (tickSize 0)                            ; don't show tick lines
                    (tickPadding 5)                         ; space to left and right of tick labels
                    (tickFormat (fn [i] (get-in data [i :label])))))
          (selectAll "text")
          ; below pushes label down to middle of bar
          (attr "dy" "1em"))

      ; transition from zero width (above) to actual width
      (.. g
          (selectAll ".bar")
          (data data-indexed)
          (transition)
          (duration 500)
          (attr "width" (fn [d i] (x (.-value d))))))
    ; return nothing : side-effecting
    nil))

(defn tree-map!
  "HOF returning a fn that mutates a dom div, adding a d3 tree-map"
  [svg-width svg-height data {:keys [transition-duration]}]
  (fn [chart-div]
    ; ported from https://bl.ocks.org/mbostock/4063582
    (let [svg (.. d3 (select chart-div)
                  (append "svg")
                  (attr "width" svg-width)
                  (attr "height" svg-height))
          margin {:top 20 :right 20 :bottom 20 :left 70}
          width (- svg-width (:left margin) (:right margin))
          height (- svg-height (:top margin) (:bottom margin))
          color (.. d3 (scaleOrdinal d3/schemeCategory10))  ; https://github.com/d3/d3-scale-chromatic
          treemap (.. d3 treemap
                      (tile d3/treemapResquarify)
                      (size (clj->js [width height]))
                      (paddingInner 1))
          root (.. d3
                   (hierarchy (clj->js data))               ; convert to d3 heirarchy object
                   (eachBefore (fn [d]                      ; assign ids to nodes
                                 (set! (.. d -data -id)
                                       (str (when (.-parent d)
                                              (str (.. d -parent -data -id) "."))
                                            (.. d -data -name)))))
                   ; set values in heirarchy
                   (sum (fn [d] (.-size d))))]

      (treemap root)                                        ; perform layout in heirarchy i.e. mutate it

      (let [joined (.. svg
                       (selectAll "g")
                       (data (.. root leaves)))
            cell (.. joined
                     (enter)
                     (append "g")
                     (attr "transform" (fn [d] (str "translate(" (.-x0 d) "," (.-y0 d) ")"))))]

        (.. cell
            (append "rect")
            (attr "id" (fn [d] (.. d -data -id)))
            (attr "width" (fn [d] (- (.-x1 d) (.-x0 d))))
            (attr "height" (fn [d] (- (.-y1 d) (.-y0 d))))
            (attr "fill" (fn [d] (color (.. d -parent -data -id)))))

        (.. cell
            (append "text")
            (attr "x" 5)
            (attr "y" 15)
            (text (fn [d] (.. d -data -name))))))
    ; return nothing. side-effecting fn
    nil))

;;;; UTILS ;;;;

; hinted fns to block munging for the custom props i.e. avoid need for externs
(defn- duration [^js props] (.-animateDuration props))
(defn- mutations [^js props] (.-d3fn props))
(defn- chart [^js props] (.-chart props))

(defn didMount
  []
  (this-as this
    (let [connect (.-connectFauxDOM (.-props this))
          animate (.-animateFauxDOM (.-props this))
          animation-duration (duration (.-props this))
          faux (connect "div" "chart")
          d3-mutations (mutations (.-props this))]
      (d3-mutations faux)
      (when animation-duration
        (animate animation-duration))
      nil)))

; TODO pass in the faux so it can be re-used for transitions
(def Container
  (create-class
    #js {:componentDidMount didMount
         :render            (fn []
                              (this-as this
                                (.createElement react "div" nil
                                                (chart (.-props this)))))}))

(defn container
  "create a plain (not om) create component using a faux dom and a fn to mutate that dom.
   the props must contain a :d3fn arity-1 fn that performs the d3 mutation"
  [props]
  (.createElement react (faux-dom/withFauxDOM Container) (clj->js props)))

