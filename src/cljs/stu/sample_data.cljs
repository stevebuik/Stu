(ns stu.sample-data)

; data captured from generation from this apps bundles

(def summaries
  [{:id "latest", :label "latest", :when 1524394701000, :value 619}
   {:id "0.6", :label "0.6", :when 1524394696000, :value 619}
   {:id "0.5", :label "0.5", :when 1524375798000, :value 703}
   {:id "0.4", :label "0.4", :when 1524362322000, :value 675}
   {:id "0.3", :label "0.3", :when 1524358064000, :value 675}
   {:id "0.2", :label "0.2", :when 1524354570000, :value 532}
   {:id "0.1", :label "0.1", :when 1524295996000, :value 240}])

(def snapshots
  {"latest"
   {:id    "latest",
    :label "latest",
    :when  1524394701000,
    :tree
           {:children
                  [{:name     "cognitect",
                    :children [{:name "cognitect/transit.cljs", :size 1}]}
                   {:name     "clojure",
                    :children [{:name "clojure/string.cljs", :size 1}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 9}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js", :size 1}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 1}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 7}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 34}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 12}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 6}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js", :size 5}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 12}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 27}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 8}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 10}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 99}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5}]}
                   {:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 133}
                           {:name "cljs/spec/alpha.cljs", :size 28}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 4}
                           {:name "stu/core.cljc", :size 3}
                           {:name "stu/d3.cljs", :size 3}]}
                   {:name "shadow", :children [{:name "shadow/js.js", :size 1}]}
                   {:name "goog",
                    :children
                          [{:name "goog/base.js", :size 1}
                           {:name "goog/math/integer.js", :size 4}
                           {:name "goog/math/long.js", :size 4}
                           {:name "goog/string/stringformat.js", :size 1}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/impl/batching.cljs", :size 1}
                           {:name "reagent/impl/component.cljs", :size 4}
                           {:name "reagent/impl/template.cljs", :size 4}
                           {:name "reagent/ratom.cljs", :size 6}]}
                   {:name "com",
                    :children
                          [{:name "com/cognitect/transit/eq.js", :size 1}
                           {:name "com/cognitect/transit/impl/decoder.js", :size 3}
                           {:name "com/cognitect/transit/types.js", :size 11}]}],
            :name "app"}},
   "0.6"
   {:id    "0.6",
    :label "0.6",
    :when  1524394696000,
    :tree
           {:children
                  [{:name     "cognitect",
                    :children [{:name "cognitect/transit.cljs", :size 1}]}
                   {:name     "clojure",
                    :children [{:name "clojure/string.cljs", :size 1}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 9}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js", :size 1}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 1}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 7}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 34}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 12}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 6}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js", :size 5}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 12}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 27}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 8}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 10}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 99}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5}]}
                   {:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 133}
                           {:name "cljs/spec/alpha.cljs", :size 28}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 4}
                           {:name "stu/core.cljc", :size 3}
                           {:name "stu/d3.cljs", :size 3}]}
                   {:name "shadow", :children [{:name "shadow/js.js", :size 1}]}
                   {:name "goog",
                    :children
                          [{:name "goog/base.js", :size 1}
                           {:name "goog/math/integer.js", :size 4}
                           {:name "goog/math/long.js", :size 4}
                           {:name "goog/string/stringformat.js", :size 1}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/impl/batching.cljs", :size 1}
                           {:name "reagent/impl/component.cljs", :size 4}
                           {:name "reagent/impl/template.cljs", :size 4}
                           {:name "reagent/ratom.cljs", :size 6}]}
                   {:name "com",
                    :children
                          [{:name "com/cognitect/transit/eq.js", :size 1}
                           {:name "com/cognitect/transit/impl/decoder.js", :size 3}
                           {:name "com/cognitect/transit/types.js", :size 11}]}],
            :name "app"}},
   "0.5"
   {:id    "0.5",
    :label "0.5",
    :when  1524375798000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 161}
                           {:name "cljs/pprint.cljs", :size 96}
                           {:name "cljs/spec/alpha.cljs", :size 21}]}
                   {:name     "clojure",
                    :children [{:name "clojure/string.cljs", :size 1}]}
                   {:name "goog", :children [{:name "goog/math/integer.js", :size 3}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 9}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js", :size 1}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 1}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 7}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 34}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 12}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 6}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js", :size 5}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 12}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 27}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 8}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 10}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 99}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/impl/batching.cljs", :size 1}
                           {:name "reagent/impl/component.cljs", :size 4}
                           {:name "reagent/impl/template.cljs", :size 4}
                           {:name "reagent/ratom.cljs", :size 6}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 1}
                           {:name "shadow/js.js", :size 1}]}
                   {:name "stu", :children [{:name "stu/core.cljc", :size 3}]}],
            :name "app"}},
   "0.4"
   {:id    "0.4",
    :label "0.4",
    :when  1524362322000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 158}
                           {:name "cljs/pprint.cljs", :size 96}]}
                   {:name     "clojure",
                    :children [{:name "clojure/string.cljs", :size 1}]}
                   {:name "goog", :children [{:name "goog/math/integer.js", :size 3}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 9}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js", :size 1}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 1}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 7}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 34}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 12}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 6}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js", :size 5}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 12}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 27}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 8}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 10}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 99}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/impl/batching.cljs", :size 1}
                           {:name "reagent/impl/component.cljs", :size 4}
                           {:name "reagent/impl/template.cljs", :size 4}
                           {:name "reagent/ratom.cljs", :size 6}]}
                   {:name "shadow", :children [{:name "shadow/js.js", :size 1}]}],
            :name "app"}},
   "0.3"
   {:id    "0.3",
    :label "0.3",
    :when  1524358064000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 158}
                           {:name "cljs/pprint.cljs", :size 96}]}
                   {:name     "clojure",
                    :children [{:name "clojure/string.cljs", :size 1}]}
                   {:name "goog", :children [{:name "goog/math/integer.js", :size 3}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 9}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js", :size 1}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 1}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 7}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 34}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 12}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 6}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js", :size 5}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 12}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 27}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 8}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 10}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 99}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/impl/batching.cljs", :size 1}
                           {:name "reagent/impl/component.cljs", :size 4}
                           {:name "reagent/impl/template.cljs", :size 4}
                           {:name "reagent/ratom.cljs", :size 6}]}
                   {:name "shadow", :children [{:name "shadow/js.js", :size 1}]}],
            :name "app"}},
   "0.2"
   {:id    "0.2",
    :label "0.2",
    :when  1524354570000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 139}
                           {:name "cljs/pprint.cljs", :size 94}]}
                   {:name "goog", :children [{:name "goog/math/integer.js", :size 3}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 9}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js", :size 1}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 1}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 7}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 34}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 12}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 6}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js", :size 5}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 12}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 27}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 8}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 10}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5}]}
                   {:name "shadow", :children [{:name "shadow/js.js", :size 1}]}],
            :name "app"}},
   "0.1"
   {:id    "0.1",
    :label "0.1",
    :when  1524295996000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 137}
                           {:name "cljs/pprint.cljs", :size 93}]}
                   {:name     "goog",
                    :children [{:name "goog/math/integer.js", :size 3}]}],
            :name "app"}}})
