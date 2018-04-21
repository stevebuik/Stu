(ns viz.app
  (:require
    [cljs.pprint :refer [pprint]]
    [sablono.core :include-macros true :refer [html]]
    [viz.d3 :as d3]))

(defprotocol Source
  (snapshots [this])
  (snapshot [this id]))

; TODO specs

(defn app-component
  "return a react component which shows the timeline and size chart"
  [source id]
  (html
    [:div {}
     [:div {} "title"]
     [:div {:style {:float       "left"
                    :marginRight "1rem"}}
      (let [snaps (snapshots source)]
        [:div {}
         [:style {} ".bar {fill: steelblue;} .bar:hover {fill: brown;cursor:pointer;}"]
         (d3/container {:d3fn            (d3/bar-chart-horizontal! 200 300 snaps
                                                                   {;:on-click click-handler
                                                                    })
                        :animateDuration 1000})])]
     [:div {:style {:float "left"}}
      (let [snap (snapshot source id)]
        (d3/container {:d3fn            (d3/tree-map! 600 350 snap {})
                       :animateDuration 1000}))]
     [:div {:style {:clear "both"}}]]))

(defn ^:export init []
  (pprint "start the engines"))
