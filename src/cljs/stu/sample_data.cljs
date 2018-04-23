(ns stu.sample-data)

; data captured from generation from this apps bundles

(def summaries
  [{:id "latest", :label "latest", :when 1524468077000, :value 636904}
   {:id "0.8", :label "0.8", :when 1524468071000, :value 636904}
   {:id "0.6", :label "0.6", :when 1524462609000, :value 633979}
   {:id "0.1", :label "0.1", :when 1524462609000, :value 246173}
   {:id "0.7", :label "0.7", :when 1524462609000, :value 636206}
   {:id "0.2", :label "0.2", :when 1524462609000, :value 545777}
   {:id "0.5", :label "0.5", :when 1524462609000, :value 720798}
   {:id "0.4", :label "0.4", :when 1524462609000, :value 691670}
   {:id "0.3", :label "0.3", :when 1524462609000, :value 691670}])

(def snapshots
  {"0.5"
   {:id    "0.5",
    :label "0.5",
    :when  1524462609000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 164993}
                           {:name "cljs/pprint.cljs", :size 98724}
                           {:name "cljs/spec/alpha.cljs", :size 21994}]}
                   {:name "clojure",
                    :children
                          [{:name "clojure/set.cljs", :size 540}
                           {:name "clojure/string.cljs", :size 1828}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 1015}
                           {:name "goog/math/integer.js", :size 3766}
                           {:name "goog/object/object.js", :size 156}
                           {:name "goog/string/string.js", :size 194}
                           {:name "goog/string/stringbuffer.js", :size 308}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3369}
                           {:name "node_modules/fbjs/lib/EventListener.js", :size 538}
                           {:name "node_modules/fbjs/lib/ExecutionEnvironment.js",
                            :size 354}
                           {:name "node_modules/fbjs/lib/containsNode.js", :size 304}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/focusNode.js", :size 121}
                           {:name "node_modules/fbjs/lib/getActiveElement.js", :size 253}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/fbjs/lib/isNode.js", :size 293}
                           {:name "node_modules/fbjs/lib/isTextNode.js", :size 171}
                           {:name "node_modules/fbjs/lib/shallowEqual.js", :size 448}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 101439}
                           {:name "node_modules/react-dom/index.js", :size 395}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 207}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 182}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/core.cljs", :size 54}
                           {:name "reagent/debug.cljs", :size 871}
                           {:name "reagent/dom.cljs", :size 565}
                           {:name "reagent/impl/batching.cljs", :size 1765}
                           {:name "reagent/impl/component.cljs", :size 4164}
                           {:name "reagent/impl/template.cljs", :size 5022}
                           {:name "reagent/impl/util.cljs", :size 822}
                           {:name "reagent/ratom.cljs", :size 6493}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 1471}
                           {:name "shadow/js.js", :size 1100}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 53}
                           {:name "stu/core.cljc", :size 3745}
                           {:name "stu/d3.cljs", :size 348}]}],
            :name "app"}},
   "0.8"
   {:id    "0.8",
    :label "0.8",
    :when  1524468071000,
    :tree
           {:children
                  [{:name     "cognitect",
                    :children [{:name "cognitect/transit.cljs", :size 1894}]}
                   {:name "clojure",
                    :children
                          [{:name "clojure/set.cljs", :size 540}
                           {:name "clojure/string.cljs", :size 1124}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3376}
                           {:name "node_modules/fbjs/lib/EventListener.js", :size 538}
                           {:name "node_modules/fbjs/lib/ExecutionEnvironment.js",
                            :size 354}
                           {:name "node_modules/fbjs/lib/containsNode.js", :size 304}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/focusNode.js", :size 121}
                           {:name "node_modules/fbjs/lib/getActiveElement.js", :size 253}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/fbjs/lib/isNode.js", :size 293}
                           {:name "node_modules/fbjs/lib/isTextNode.js", :size 171}
                           {:name "node_modules/fbjs/lib/shallowEqual.js", :size 448}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 101439}
                           {:name "node_modules/react-dom/index.js", :size 395}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 214}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 182}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 136433}
                           {:name "cljs/spec/alpha.cljs", :size 29610}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 903}
                           {:name "shadow/js.js", :size 1100}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 1025}
                           {:name "goog/math/integer.js", :size 4259}
                           {:name "goog/math/long.js", :size 4331}
                           {:name "goog/object/object.js", :size 153}
                           {:name "goog/reflect/reflect.js", :size 83}
                           {:name "goog/string/string.js", :size 226}
                           {:name "goog/string/stringbuffer.js", :size 308}
                           {:name "goog/string/stringformat.js", :size 1062}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 5975}
                           {:name "stu/core.cljc", :size 3745}
                           {:name "stu/d3.cljs", :size 5237}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/core.cljs", :size 78}
                           {:name "reagent/debug.cljs", :size 867}
                           {:name "reagent/dom.cljs", :size 663}
                           {:name "reagent/impl/batching.cljs", :size 1765}
                           {:name "reagent/impl/component.cljs", :size 4164}
                           {:name "reagent/impl/template.cljs", :size 5015}
                           {:name "reagent/impl/util.cljs", :size 901}
                           {:name "reagent/ratom.cljs", :size 6489}]}
                   {:name "com",
                    :children
                          [{:name "com/cognitect/transit.js", :size 139}
                           {:name "com/cognitect/transit/caching.js", :size 409}
                           {:name "com/cognitect/transit/delimiters.js", :size 21}
                           {:name "com/cognitect/transit/eq.js", :size 1374}
                           {:name "com/cognitect/transit/impl/decoder.js", :size 3390}
                           {:name "com/cognitect/transit/impl/reader.js", :size 283}
                           {:name "com/cognitect/transit/types.js", :size 11809}
                           {:name "com/cognitect/transit/util.js", :size 902}]}],
            :name "app"}},
   "0.7"
   {:id    "0.7",
    :label "0.7",
    :when  1524462609000,
    :tree
           {:children
                  [{:name     "cognitect",
                    :children [{:name "cognitect/transit.cljs", :size 1894}]}
                   {:name "clojure",
                    :children
                          [{:name "clojure/set.cljs", :size 540}
                           {:name "clojure/string.cljs", :size 1124}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3376}
                           {:name "node_modules/fbjs/lib/EventListener.js", :size 538}
                           {:name "node_modules/fbjs/lib/ExecutionEnvironment.js",
                            :size 354}
                           {:name "node_modules/fbjs/lib/containsNode.js", :size 304}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/focusNode.js", :size 121}
                           {:name "node_modules/fbjs/lib/getActiveElement.js", :size 253}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/fbjs/lib/isNode.js", :size 293}
                           {:name "node_modules/fbjs/lib/isTextNode.js", :size 171}
                           {:name "node_modules/fbjs/lib/shallowEqual.js", :size 448}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 101439}
                           {:name "node_modules/react-dom/index.js", :size 395}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 214}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 182}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 136433}
                           {:name "cljs/spec/alpha.cljs", :size 29621}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 899}
                           {:name "shadow/js.js", :size 1100}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 1025}
                           {:name "goog/math/integer.js", :size 4259}
                           {:name "goog/math/long.js", :size 4331}
                           {:name "goog/object/object.js", :size 153}
                           {:name "goog/reflect/reflect.js", :size 83}
                           {:name "goog/string/string.js", :size 226}
                           {:name "goog/string/stringbuffer.js", :size 308}
                           {:name "goog/string/stringformat.js", :size 1062}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 5918}
                           {:name "stu/core.cljc", :size 3745}
                           {:name "stu/d3.cljs", :size 4589}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/core.cljs", :size 78}
                           {:name "reagent/debug.cljs", :size 867}
                           {:name "reagent/dom.cljs", :size 663}
                           {:name "reagent/impl/batching.cljs", :size 1765}
                           {:name "reagent/impl/component.cljs", :size 4164}
                           {:name "reagent/impl/template.cljs", :size 5015}
                           {:name "reagent/impl/util.cljs", :size 901}
                           {:name "reagent/ratom.cljs", :size 6489}]}
                   {:name "com",
                    :children
                          [{:name "com/cognitect/transit.js", :size 139}
                           {:name "com/cognitect/transit/caching.js", :size 409}
                           {:name "com/cognitect/transit/delimiters.js", :size 21}
                           {:name "com/cognitect/transit/eq.js", :size 1374}
                           {:name "com/cognitect/transit/impl/decoder.js", :size 3390}
                           {:name "com/cognitect/transit/impl/reader.js", :size 283}
                           {:name "com/cognitect/transit/types.js", :size 11809}
                           {:name "com/cognitect/transit/util.js", :size 902}]}],
            :name "app"}},
   "0.2"
   {:id    "0.2",
    :label "0.2",
    :when  1524462609000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 142897}
                           {:name "cljs/pprint.cljs", :size 96842}]}
                   {:name     "clojure",
                    :children [{:name "clojure/string.cljs", :size 326}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 998}
                           {:name "goog/dom/browserfeature.js", :size 81}
                           {:name "goog/labs/useragent/browser.js", :size 34}
                           {:name "goog/labs/useragent/engine.js", :size 89}
                           {:name "goog/labs/useragent/platform.js", :size 177}
                           {:name "goog/labs/useragent/util.js", :size 118}
                           {:name "goog/math/integer.js", :size 3766}
                           {:name "goog/object/object.js", :size 142}
                           {:name "goog/reflect/reflect.js", :size 79}
                           {:name "goog/string/string.js", :size 782}
                           {:name "goog/string/stringbuffer.js", :size 308}
                           {:name "goog/useragent/useragent.js", :size 704}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3369}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 207}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 180}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 847}
                           {:name "shadow/js.js", :size 1095}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 58}
                           {:name "stu/d3.cljs", :size 348}]}],
            :name "app"}},
   "0.3"
   {:id    "0.3",
    :label "0.3",
    :when  1524462609000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 162214}
                           {:name "cljs/pprint.cljs", :size 98721}]}
                   {:name "clojure",
                    :children
                          [{:name "clojure/set.cljs", :size 540}
                           {:name "clojure/string.cljs", :size 1828}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 1001}
                           {:name "goog/math/integer.js", :size 3766}
                           {:name "goog/object/object.js", :size 153}
                           {:name "goog/string/string.js", :size 194}
                           {:name "goog/string/stringbuffer.js", :size 308}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3369}
                           {:name "node_modules/fbjs/lib/EventListener.js", :size 538}
                           {:name "node_modules/fbjs/lib/ExecutionEnvironment.js",
                            :size 354}
                           {:name "node_modules/fbjs/lib/containsNode.js", :size 304}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/focusNode.js", :size 121}
                           {:name "node_modules/fbjs/lib/getActiveElement.js", :size 253}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/fbjs/lib/isNode.js", :size 293}
                           {:name "node_modules/fbjs/lib/isTextNode.js", :size 171}
                           {:name "node_modules/fbjs/lib/shallowEqual.js", :size 448}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 101439}
                           {:name "node_modules/react-dom/index.js", :size 395}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 207}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 182}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/core.cljs", :size 54}
                           {:name "reagent/debug.cljs", :size 871}
                           {:name "reagent/dom.cljs", :size 565}
                           {:name "reagent/impl/batching.cljs", :size 1765}
                           {:name "reagent/impl/component.cljs", :size 4164}
                           {:name "reagent/impl/template.cljs", :size 5022}
                           {:name "reagent/impl/util.cljs", :size 822}
                           {:name "reagent/ratom.cljs", :size 6493}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 951}
                           {:name "shadow/js.js", :size 1100}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 53}
                           {:name "stu/d3.cljs", :size 348}]}],
            :name "app"}},
   "0.6"
   {:id    "0.6",
    :label "0.6",
    :when  1524462609000,
    :tree
           {:children
                  [{:name     "cognitect",
                    :children [{:name "cognitect/transit.cljs", :size 1894}]}
                   {:name "clojure",
                    :children
                          [{:name "clojure/set.cljs", :size 540}
                           {:name "clojure/string.cljs", :size 1106}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3376}
                           {:name "node_modules/fbjs/lib/EventListener.js", :size 538}
                           {:name "node_modules/fbjs/lib/ExecutionEnvironment.js",
                            :size 354}
                           {:name "node_modules/fbjs/lib/containsNode.js", :size 304}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/focusNode.js", :size 121}
                           {:name "node_modules/fbjs/lib/getActiveElement.js", :size 253}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/fbjs/lib/isNode.js", :size 293}
                           {:name "node_modules/fbjs/lib/isTextNode.js", :size 171}
                           {:name "node_modules/fbjs/lib/shallowEqual.js", :size 448}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 101439}
                           {:name "node_modules/react-dom/index.js", :size 395}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 214}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 182}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 136363}
                           {:name "cljs/spec/alpha.cljs", :size 29621}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 871}
                           {:name "shadow/js.js", :size 1100}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 1025}
                           {:name "goog/math/integer.js", :size 4259}
                           {:name "goog/math/long.js", :size 4331}
                           {:name "goog/object/object.js", :size 153}
                           {:name "goog/reflect/reflect.js", :size 83}
                           {:name "goog/string/string.js", :size 226}
                           {:name "goog/string/stringbuffer.js", :size 308}
                           {:name "goog/string/stringformat.js", :size 1062}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 4662}
                           {:name "stu/core.cljc", :size 3745}
                           {:name "stu/d3.cljs", :size 3765}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/core.cljs", :size 69}
                           {:name "reagent/debug.cljs", :size 867}
                           {:name "reagent/dom.cljs", :size 658}
                           {:name "reagent/impl/batching.cljs", :size 1765}
                           {:name "reagent/impl/component.cljs", :size 4164}
                           {:name "reagent/impl/template.cljs", :size 5015}
                           {:name "reagent/impl/util.cljs", :size 891}
                           {:name "reagent/ratom.cljs", :size 6489}]}
                   {:name "com",
                    :children
                          [{:name "com/cognitect/transit.js", :size 139}
                           {:name "com/cognitect/transit/caching.js", :size 409}
                           {:name "com/cognitect/transit/delimiters.js", :size 21}
                           {:name "com/cognitect/transit/eq.js", :size 1374}
                           {:name "com/cognitect/transit/impl/decoder.js", :size 3390}
                           {:name "com/cognitect/transit/impl/reader.js", :size 283}
                           {:name "com/cognitect/transit/types.js", :size 11809}
                           {:name "com/cognitect/transit/util.js", :size 902}]}],
            :name "app"}},
   "latest"
   {:id    "latest",
    :label "latest",
    :when  1524468077000,
    :tree
           {:children
                  [{:name     "cognitect",
                    :children [{:name "cognitect/transit.cljs", :size 1894}]}
                   {:name "clojure",
                    :children
                          [{:name "clojure/set.cljs", :size 540}
                           {:name "clojure/string.cljs", :size 1124}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3376}
                           {:name "node_modules/fbjs/lib/EventListener.js", :size 538}
                           {:name "node_modules/fbjs/lib/ExecutionEnvironment.js",
                            :size 354}
                           {:name "node_modules/fbjs/lib/containsNode.js", :size 304}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/focusNode.js", :size 121}
                           {:name "node_modules/fbjs/lib/getActiveElement.js", :size 253}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/fbjs/lib/isNode.js", :size 293}
                           {:name "node_modules/fbjs/lib/isTextNode.js", :size 171}
                           {:name "node_modules/fbjs/lib/shallowEqual.js", :size 448}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 101439}
                           {:name "node_modules/react-dom/index.js", :size 395}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 214}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 182}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 136433}
                           {:name "cljs/spec/alpha.cljs", :size 29610}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 903}
                           {:name "shadow/js.js", :size 1100}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 1025}
                           {:name "goog/math/integer.js", :size 4259}
                           {:name "goog/math/long.js", :size 4331}
                           {:name "goog/object/object.js", :size 153}
                           {:name "goog/reflect/reflect.js", :size 83}
                           {:name "goog/string/string.js", :size 226}
                           {:name "goog/string/stringbuffer.js", :size 308}
                           {:name "goog/string/stringformat.js", :size 1062}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 5975}
                           {:name "stu/core.cljc", :size 3745}
                           {:name "stu/d3.cljs", :size 5237}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/core.cljs", :size 78}
                           {:name "reagent/debug.cljs", :size 867}
                           {:name "reagent/dom.cljs", :size 663}
                           {:name "reagent/impl/batching.cljs", :size 1765}
                           {:name "reagent/impl/component.cljs", :size 4164}
                           {:name "reagent/impl/template.cljs", :size 5015}
                           {:name "reagent/impl/util.cljs", :size 901}
                           {:name "reagent/ratom.cljs", :size 6489}]}
                   {:name "com",
                    :children
                          [{:name "com/cognitect/transit.js", :size 139}
                           {:name "com/cognitect/transit/caching.js", :size 409}
                           {:name "com/cognitect/transit/delimiters.js", :size 21}
                           {:name "com/cognitect/transit/eq.js", :size 1374}
                           {:name "com/cognitect/transit/impl/decoder.js", :size 3390}
                           {:name "com/cognitect/transit/impl/reader.js", :size 283}
                           {:name "com/cognitect/transit/types.js", :size 11809}
                           {:name "com/cognitect/transit/util.js", :size 902}]}],
            :name "app"}},
   "0.4"
   {:id    "0.4",
    :label "0.4",
    :when  1524462609000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 162214}
                           {:name "cljs/pprint.cljs", :size 98721}]}
                   {:name "clojure",
                    :children
                          [{:name "clojure/set.cljs", :size 540}
                           {:name "clojure/string.cljs", :size 1828}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 1001}
                           {:name "goog/math/integer.js", :size 3766}
                           {:name "goog/object/object.js", :size 153}
                           {:name "goog/string/string.js", :size 194}
                           {:name "goog/string/stringbuffer.js", :size 308}]}
                   {:name "node_modules",
                    :children
                          [{:name "node_modules/create-react-class/factory.js", :size 4931}
                           {:name "node_modules/create-react-class/index.js", :size 484}
                           {:name "node_modules/d3-array/build/d3-array.js", :size 5816}
                           {:name "node_modules/d3-axis/build/d3-axis.js", :size 2909}
                           {:name "node_modules/d3-brush/build/d3-brush.js", :size 8741}
                           {:name "node_modules/d3-chord/build/d3-chord.js", :size 2780}
                           {:name "node_modules/d3-collection/build/d3-collection.js",
                            :size 2819}
                           {:name "node_modules/d3-color/build/d3-color.js", :size 10066}
                           {:name "node_modules/d3-contour/dist/d3-contour.js", :size 5582}
                           {:name "node_modules/d3-dispatch/build/d3-dispatch.js",
                            :size 1802}
                           {:name "node_modules/d3-drag/build/d3-drag.js", :size 3779}
                           {:name "node_modules/d3-dsv/build/d3-dsv.js", :size 2042}
                           {:name "node_modules/d3-ease/build/d3-ease.js", :size 3073}
                           {:name "node_modules/d3-fetch/dist/d3-fetch.js", :size 1563}
                           {:name "node_modules/d3-force/build/d3-force.js", :size 8000}
                           {:name "node_modules/d3-format/build/d3-format.js", :size 4607}
                           {:name "node_modules/d3-geo/dist/d3-geo.js", :size 35475}
                           {:name "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                            :size 13298}
                           {:name "node_modules/d3-interpolate/build/d3-interpolate.js",
                            :size 7123}
                           {:name "node_modules/d3-path/build/d3-path.js", :size 2128}
                           {:name "node_modules/d3-polygon/build/d3-polygon.js", :size 1560}
                           {:name "node_modules/d3-quadtree/build/d3-quadtree.js",
                            :size 5418}
                           {:name "node_modules/d3-random/build/d3-random.js", :size 1285}
                           {:name
                                  "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                            :size 18716}
                           {:name "node_modules/d3-scale/dist/d3-scale.js", :size 11494}
                           {:name "node_modules/d3-selection/dist/d3-selection.js",
                            :size 13235}
                           {:name "node_modules/d3-shape/build/d3-shape.js", :size 28529}
                           {:name "node_modules/d3-time-format/build/d3-time-format.js",
                            :size 8903}
                           {:name "node_modules/d3-time/build/d3-time.js", :size 5663}
                           {:name "node_modules/d3-timer/build/d3-timer.js", :size 1818}
                           {:name "node_modules/d3-transition/build/d3-transition.js",
                            :size 10318}
                           {:name "node_modules/d3-voronoi/build/d3-voronoi.js", :size 9033}
                           {:name "node_modules/d3-zoom/build/d3-zoom.js", :size 9260}
                           {:name "node_modules/d3/dist/d3.node.js", :size 3369}
                           {:name "node_modules/fbjs/lib/EventListener.js", :size 538}
                           {:name "node_modules/fbjs/lib/ExecutionEnvironment.js",
                            :size 354}
                           {:name "node_modules/fbjs/lib/containsNode.js", :size 304}
                           {:name "node_modules/fbjs/lib/emptyFunction.js", :size 323}
                           {:name "node_modules/fbjs/lib/emptyObject.js", :size 88}
                           {:name "node_modules/fbjs/lib/focusNode.js", :size 121}
                           {:name "node_modules/fbjs/lib/getActiveElement.js", :size 253}
                           {:name "node_modules/fbjs/lib/invariant.js", :size 404}
                           {:name "node_modules/fbjs/lib/isNode.js", :size 293}
                           {:name "node_modules/fbjs/lib/isTextNode.js", :size 171}
                           {:name "node_modules/fbjs/lib/shallowEqual.js", :size 448}
                           {:name "node_modules/object-assign/index.js", :size 981}
                           {:name "node_modules/query-selector/index.js", :size 144}
                           {:name "node_modules/query-selector/lib/query-selector.js",
                            :size 6328}
                           {:name
                                  "node_modules/query-selector/lib/query-selector/parser.js",
                            :size 11136}
                           {:name "node_modules/query-selector/lib/query-selector/util.js",
                            :size 3901}
                           {:name "node_modules/react-dom/cjs/react-dom.production.min.js",
                            :size 101439}
                           {:name "node_modules/react-dom/index.js", :size 395}
                           {:name "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                            :size 207}
                           {:name "node_modules/react-faux-dom/lib/_element.js", :size 5315}
                           {:name "node_modules/react-faux-dom/lib/_window.js", :size 186}
                           {:name "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                            :size 1579}
                           {:name "node_modules/react-faux-dom/lib/factory.js", :size 519}
                           {:name "node_modules/react-faux-dom/lib/utils/assign.js",
                            :size 192}
                           {:name "node_modules/react-faux-dom/lib/utils/camelCase.js",
                            :size 221}
                           {:name "node_modules/react-faux-dom/lib/utils/isString.js",
                            :size 137}
                           {:name "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                            :size 143}
                           {:name "node_modules/react-faux-dom/lib/utils/mapValues.js",
                            :size 181}
                           {:name "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                            :size 343}
                           {:name "node_modules/react/cjs/react.production.min.js",
                            :size 5335}
                           {:name "node_modules/react/index.js", :size 182}
                           {:name "node_modules/style-attr/lib/index.js", :size 703}]}
                   {:name "reagent",
                    :children
                          [{:name "reagent/core.cljs", :size 54}
                           {:name "reagent/debug.cljs", :size 871}
                           {:name "reagent/dom.cljs", :size 565}
                           {:name "reagent/impl/batching.cljs", :size 1765}
                           {:name "reagent/impl/component.cljs", :size 4164}
                           {:name "reagent/impl/template.cljs", :size 5022}
                           {:name "reagent/impl/util.cljs", :size 822}
                           {:name "reagent/ratom.cljs", :size 6493}]}
                   {:name "shadow",
                    :children
                          [{:name "shadow/cljs/constants/main.js", :size 951}
                           {:name "shadow/js.js", :size 1100}]}
                   {:name "stu",
                    :children
                          [{:name "stu/app.cljs", :size 53}
                           {:name "stu/d3.cljs", :size 348}]}],
            :name "app"}},
   "0.1"
   {:id    "0.1",
    :label "0.1",
    :when  1524462609000,
    :tree
           {:children
                  [{:name "cljs",
                    :children
                          [{:name "cljs/core.cljs", :size 141087}
                           {:name "cljs/pprint.cljs", :size 95433}]}
                   {:name     "clojure",
                    :children [{:name "clojure/string.cljs", :size 322}]}
                   {:name "goog",
                    :children
                          [{:name "goog/array/array.js", :size 101}
                           {:name "goog/base.js", :size 996}
                           {:name "goog/dom/browserfeature.js", :size 81}
                           {:name "goog/labs/useragent/browser.js", :size 34}
                           {:name "goog/labs/useragent/engine.js", :size 89}
                           {:name "goog/labs/useragent/platform.js", :size 177}
                           {:name "goog/labs/useragent/util.js", :size 118}
                           {:name "goog/math/integer.js", :size 3725}
                           {:name "goog/object/object.js", :size 142}
                           {:name "goog/reflect/reflect.js", :size 79}
                           {:name "goog/string/string.js", :size 782}
                           {:name "goog/string/stringbuffer.js", :size 308}
                           {:name "goog/useragent/useragent.js", :size 704}]}
                   {:name     "shadow",
                    :children [{:name "shadow/cljs/constants/main.js", :size 847}]}
                   {:name "stu", :children [{:name "stu/app.cljs", :size 58}]}],
            :name "app"}}})
