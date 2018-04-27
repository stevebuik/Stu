(ns ^{:doc "this is is recorded from illuminate/generate-shadow-viz! i.e. is a real example"}
stu.sample-data)

; data captured from generation from this apps bundles

(def summaries
  [{:id    "latest",
    :label "latest",
    :when  1524534766000,
    :modules
           [{:module-id :shared, :size 410147, :size-compressed 119538}
            {:module-id :main, :size 228847, :size-compressed 67853}]}
   {:id      "0.8",
    :label   "0.8",
    :when    1524468071000,
    :modules [{:module-id :main, :size 636904, :size-compressed 184471}]}
   {:id      "0.7",
    :label   "0.7",
    :when    1524462609000,
    :modules [{:module-id :main, :size 636206, :size-compressed 184238}]}
   {:id      "0.5",
    :label   "0.5",
    :when    1524462609000,
    :modules [{:module-id :main, :size 720798, :size-compressed 199474}]}
   {:id      "0.4",
    :label   "0.4",
    :when    1524462609000,
    :modules [{:module-id :main, :size 691670, :size-compressed 191400}]}
   {:id      "0.3",
    :label   "0.3",
    :when    1524462609000,
    :modules [{:module-id :main, :size 691670, :size-compressed 191400}]}
   {:id      "0.2",
    :label   "0.2",
    :when    1524462609000,
    :modules [{:module-id :main, :size 545777, :size-compressed 149305}]}
   {:id      "0.1",
    :label   "0.1",
    :when    1524462609000,
    :modules [{:module-id :main, :size 246173, :size-compressed 54049}]}])

(def snapshots
  {"0.9"
   [{:id          "shared",
     :label       "shared",
     :when        1524550380000,
     :size        408701,
     :size-before 3019685,
     :tree
                  {:children
                         [{:name     " [synthetic:1] ",
                           :children [{:name " [synthetic:1] ", :size 75}]}
                          {:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 105979, :size-before 1266240}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 791, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 4045, :size-before 24550}
                                  {:name "goog/math/long.js", :size 30, :size-before 30213}
                                  {:name "goog/object/object.js", :size 145, :size-before 22128}
                                  {:name "goog/string/string.js", :size 145, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}
                                  {:name        "goog/string/stringformat.js",
                                   :size        655,
                                   :size-before 8174}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3376,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        214,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        180,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/shared.js", :size 131}
                                  {:name "shadow/js.js", :size 1095, :size-before 3507}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/d3.cljs", :size 1022, :size-before 20279}]}],
                   :name "app"}}
    {:id          "main",
     :label       "main",
     :when        1524550380000,
     :size        231189,
     :size-before 3019685,
     :tree
                  {:children
                         [{:name "cognitect",
                           :children
                                 [{:name        "cognitect/transit.cljs",
                                   :size        1903,
                                   :size-before 42731}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/set.cljs", :size 540, :size-before 14703}
                                  {:name "clojure/string.cljs", :size 1124, :size-before 14691}]}
                          {:name     " [synthetic:1] ",
                           :children [{:name " [synthetic:1] ", :size 33}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/fbjs/lib/EventListener.js",
                                   :size        538,
                                   :size-before 540}
                                  {:name        "node_modules/fbjs/lib/ExecutionEnvironment.js",
                                   :size        354,
                                   :size-before 355}
                                  {:name        "node_modules/fbjs/lib/containsNode.js",
                                   :size        304,
                                   :size-before 305}
                                  {:name        "node_modules/fbjs/lib/focusNode.js",
                                   :size        121,
                                   :size-before 122}
                                  {:name        "node_modules/fbjs/lib/getActiveElement.js",
                                   :size        253,
                                   :size-before 254}
                                  {:name        "node_modules/fbjs/lib/isNode.js",
                                   :size        293,
                                   :size-before 294}
                                  {:name        "node_modules/fbjs/lib/isTextNode.js",
                                   :size        171,
                                   :size-before 172}
                                  {:name        "node_modules/fbjs/lib/shallowEqual.js",
                                   :size        448,
                                   :size-before 449}
                                  {:name        "node_modules/react-dom/cjs/react-dom.production.min.js",
                                   :size        101439,
                                   :size-before 101633}
                                  {:name        "node_modules/react-dom/index.js",
                                   :size        395,
                                   :size-before 352}
                                  {:name        "node_modules/react/index.js",
                                   :size        2,
                                   :size-before 133}]}
                          {:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 32396, :size-before 1266240}
                                  {:name        "cljs/spec/alpha.cljs",
                                   :size        29621,
                                   :size-before 290821}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 811}
                                  {:name "shadow/js.js", :size 5, :size-before 3507}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/base.js", :size 239, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 270, :size-before 24550}
                                  {:name "goog/math/long.js", :size 4313, :size-before 30213}
                                  {:name "goog/object/object.js", :size 8, :size-before 22128}
                                  {:name "goog/reflect/reflect.js", :size 83, :size-before 4627}
                                  {:name "goog/string/string.js", :size 81, :size-before 53241}
                                  {:name        "goog/string/stringformat.js",
                                   :size        408,
                                   :size-before 8174}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 7063, :size-before 31653}
                                  {:name "stu/core.cljc", :size 5294, :size-before 31238}
                                  {:name "stu/d3.cljs", :size 4452, :size-before 20279}]}
                          {:name "reagent",
                           :children
                                 [{:name "reagent/core.cljs", :size 78, :size-before 23218}
                                  {:name "reagent/debug.cljs", :size 867, :size-before 3054}
                                  {:name "reagent/dom.cljs", :size 663, :size-before 6175}
                                  {:name        "reagent/impl/batching.cljs",
                                   :size        1770,
                                   :size-before 7106}
                                  {:name        "reagent/impl/component.cljs",
                                   :size        4164,
                                   :size-before 19792}
                                  {:name        "reagent/impl/template.cljs",
                                   :size        5015,
                                   :size-before 29510}
                                  {:name "reagent/impl/util.cljs", :size 854, :size-before 24447}
                                  {:name "reagent/ratom.cljs", :size 6489, :size-before 56808}]}
                          {:name "com",
                           :children
                                 [{:name        "com/cognitect/transit.js",
                                   :size        139,
                                   :size-before 26016}
                                  {:name        "com/cognitect/transit/caching.js",
                                   :size        409,
                                   :size-before 4409}
                                  {:name        "com/cognitect/transit/delimiters.js",
                                   :size        21,
                                   :size-before 1062}
                                  {:name        "com/cognitect/transit/eq.js",
                                   :size        1374,
                                   :size-before 5804}
                                  {:name        "com/cognitect/transit/impl/decoder.js",
                                   :size        3390,
                                   :size-before 12914}
                                  {:name        "com/cognitect/transit/impl/reader.js",
                                   :size        283,
                                   :size-before 2131}
                                  {:name        "com/cognitect/transit/types.js",
                                   :size        11809,
                                   :size-before 37079}
                                  {:name        "com/cognitect/transit/util.js",
                                   :size        902,
                                   :size-before 4881}]}],
                   :name "app"}}],
   "0.5"
   [{:id          "main",
     :label       "main",
     :when        1524462609000,
     :size        718575,
     :size-before 3324063,
     :tree
                  {:children
                         [{:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 164993, :size-before 1266240}
                                  {:name "cljs/pprint.cljs", :size 98724, :size-before 521630}
                                  {:name        "cljs/spec/alpha.cljs",
                                   :size        21994,
                                   :size-before 290821}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/set.cljs", :size 540, :size-before 14703}
                                  {:name "clojure/string.cljs", :size 1828, :size-before 14691}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 1015, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 3766, :size-before 24550}
                                  {:name "goog/object/object.js", :size 156, :size-before 22128}
                                  {:name "goog/string/string.js", :size 194, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3369,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/EventListener.js",
                                   :size        538,
                                   :size-before 540}
                                  {:name        "node_modules/fbjs/lib/ExecutionEnvironment.js",
                                   :size        354,
                                   :size-before 355}
                                  {:name        "node_modules/fbjs/lib/containsNode.js",
                                   :size        304,
                                   :size-before 305}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/focusNode.js",
                                   :size        121,
                                   :size-before 122}
                                  {:name        "node_modules/fbjs/lib/getActiveElement.js",
                                   :size        253,
                                   :size-before 254}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/fbjs/lib/isNode.js",
                                   :size        293,
                                   :size-before 294}
                                  {:name        "node_modules/fbjs/lib/isTextNode.js",
                                   :size        171,
                                   :size-before 172}
                                  {:name        "node_modules/fbjs/lib/shallowEqual.js",
                                   :size        448,
                                   :size-before 449}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-dom/cjs/react-dom.production.min.js",
                                   :size        101439,
                                   :size-before 101633}
                                  {:name        "node_modules/react-dom/index.js",
                                   :size        395,
                                   :size-before 352}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        207,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        182,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "reagent",
                           :children
                                 [{:name "reagent/core.cljs", :size 54, :size-before 23218}
                                  {:name "reagent/debug.cljs", :size 871, :size-before 3054}
                                  {:name "reagent/dom.cljs", :size 565, :size-before 6175}
                                  {:name        "reagent/impl/batching.cljs",
                                   :size        1765,
                                   :size-before 7106}
                                  {:name        "reagent/impl/component.cljs",
                                   :size        4164,
                                   :size-before 19792}
                                  {:name        "reagent/impl/template.cljs",
                                   :size        5022,
                                   :size-before 29510}
                                  {:name "reagent/impl/util.cljs", :size 822, :size-before 24447}
                                  {:name "reagent/ratom.cljs", :size 6493, :size-before 56808}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 1471}
                                  {:name "shadow/js.js", :size 1100, :size-before 3507}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 53, :size-before 8317}
                                  {:name "stu/core.cljc", :size 3745, :size-before 20303}
                                  {:name "stu/d3.cljs", :size 348, :size-before 13767}]}],
                   :name "app"}}],
   "0.8"
   [{:id          "main",
     :label       "main",
     :when        1524468071000,
     :size        634875,
     :size-before 3001806,
     :tree
                  {:children
                         [{:name "cognitect",
                           :children
                                 [{:name        "cognitect/transit.cljs",
                                   :size        1894,
                                   :size-before 42731}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/set.cljs", :size 540, :size-before 14703}
                                  {:name "clojure/string.cljs", :size 1124, :size-before 14691}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3376,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/EventListener.js",
                                   :size        538,
                                   :size-before 540}
                                  {:name        "node_modules/fbjs/lib/ExecutionEnvironment.js",
                                   :size        354,
                                   :size-before 355}
                                  {:name        "node_modules/fbjs/lib/containsNode.js",
                                   :size        304,
                                   :size-before 305}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/focusNode.js",
                                   :size        121,
                                   :size-before 122}
                                  {:name        "node_modules/fbjs/lib/getActiveElement.js",
                                   :size        253,
                                   :size-before 254}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/fbjs/lib/isNode.js",
                                   :size        293,
                                   :size-before 294}
                                  {:name        "node_modules/fbjs/lib/isTextNode.js",
                                   :size        171,
                                   :size-before 172}
                                  {:name        "node_modules/fbjs/lib/shallowEqual.js",
                                   :size        448,
                                   :size-before 449}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-dom/cjs/react-dom.production.min.js",
                                   :size        101439,
                                   :size-before 101633}
                                  {:name        "node_modules/react-dom/index.js",
                                   :size        395,
                                   :size-before 352}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        214,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        182,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 136433, :size-before 1266240}
                                  {:name        "cljs/spec/alpha.cljs",
                                   :size        29610,
                                   :size-before 290821}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 903}
                                  {:name "shadow/js.js", :size 1100, :size-before 3507}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 1025, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 4259, :size-before 24550}
                                  {:name "goog/math/long.js", :size 4331, :size-before 30213}
                                  {:name "goog/object/object.js", :size 153, :size-before 22128}
                                  {:name "goog/reflect/reflect.js", :size 83, :size-before 4627}
                                  {:name "goog/string/string.js", :size 226, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}
                                  {:name        "goog/string/stringformat.js",
                                   :size        1062,
                                   :size-before 8174}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 5975, :size-before 24909}
                                  {:name "stu/core.cljc", :size 3745, :size-before 20306}
                                  {:name "stu/d3.cljs", :size 5237, :size-before 20076}]}
                          {:name "reagent",
                           :children
                                 [{:name "reagent/core.cljs", :size 78, :size-before 23218}
                                  {:name "reagent/debug.cljs", :size 867, :size-before 3054}
                                  {:name "reagent/dom.cljs", :size 663, :size-before 6175}
                                  {:name        "reagent/impl/batching.cljs",
                                   :size        1765,
                                   :size-before 7106}
                                  {:name        "reagent/impl/component.cljs",
                                   :size        4164,
                                   :size-before 19792}
                                  {:name        "reagent/impl/template.cljs",
                                   :size        5015,
                                   :size-before 29510}
                                  {:name "reagent/impl/util.cljs", :size 901, :size-before 24447}
                                  {:name "reagent/ratom.cljs", :size 6489, :size-before 56808}]}
                          {:name "com",
                           :children
                                 [{:name        "com/cognitect/transit.js",
                                   :size        139,
                                   :size-before 26016}
                                  {:name        "com/cognitect/transit/caching.js",
                                   :size        409,
                                   :size-before 4409}
                                  {:name        "com/cognitect/transit/delimiters.js",
                                   :size        21,
                                   :size-before 1062}
                                  {:name        "com/cognitect/transit/eq.js",
                                   :size        1374,
                                   :size-before 5804}
                                  {:name        "com/cognitect/transit/impl/decoder.js",
                                   :size        3390,
                                   :size-before 12914}
                                  {:name        "com/cognitect/transit/impl/reader.js",
                                   :size        283,
                                   :size-before 2131}
                                  {:name        "com/cognitect/transit/types.js",
                                   :size        11809,
                                   :size-before 37079}
                                  {:name        "com/cognitect/transit/util.js",
                                   :size        902,
                                   :size-before 4881}]}],
                   :name "app"}}],
   "0.7"
   [{:id          "main",
     :label       "main",
     :when        1524462609000,
     :size        634177,
     :size-before 2998941,
     :tree
                  {:children
                         [{:name "cognitect",
                           :children
                                 [{:name        "cognitect/transit.cljs",
                                   :size        1894,
                                   :size-before 42731}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/set.cljs", :size 540, :size-before 14703}
                                  {:name "clojure/string.cljs", :size 1124, :size-before 14691}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3376,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/EventListener.js",
                                   :size        538,
                                   :size-before 540}
                                  {:name        "node_modules/fbjs/lib/ExecutionEnvironment.js",
                                   :size        354,
                                   :size-before 355}
                                  {:name        "node_modules/fbjs/lib/containsNode.js",
                                   :size        304,
                                   :size-before 305}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/focusNode.js",
                                   :size        121,
                                   :size-before 122}
                                  {:name        "node_modules/fbjs/lib/getActiveElement.js",
                                   :size        253,
                                   :size-before 254}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/fbjs/lib/isNode.js",
                                   :size        293,
                                   :size-before 294}
                                  {:name        "node_modules/fbjs/lib/isTextNode.js",
                                   :size        171,
                                   :size-before 172}
                                  {:name        "node_modules/fbjs/lib/shallowEqual.js",
                                   :size        448,
                                   :size-before 449}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-dom/cjs/react-dom.production.min.js",
                                   :size        101439,
                                   :size-before 101633}
                                  {:name        "node_modules/react-dom/index.js",
                                   :size        395,
                                   :size-before 352}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        214,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        182,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 136433, :size-before 1266240}
                                  {:name        "cljs/spec/alpha.cljs",
                                   :size        29621,
                                   :size-before 290821}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 899}
                                  {:name "shadow/js.js", :size 1100, :size-before 3507}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 1025, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 4259, :size-before 24550}
                                  {:name "goog/math/long.js", :size 4331, :size-before 30213}
                                  {:name "goog/object/object.js", :size 153, :size-before 22128}
                                  {:name "goog/reflect/reflect.js", :size 83, :size-before 4627}
                                  {:name "goog/string/string.js", :size 226, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}
                                  {:name        "goog/string/stringformat.js",
                                   :size        1062,
                                   :size-before 8174}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 5918, :size-before 24621}
                                  {:name "stu/core.cljc", :size 3745, :size-before 20303}
                                  {:name "stu/d3.cljs", :size 4589, :size-before 17502}]}
                          {:name "reagent",
                           :children
                                 [{:name "reagent/core.cljs", :size 78, :size-before 23218}
                                  {:name "reagent/debug.cljs", :size 867, :size-before 3054}
                                  {:name "reagent/dom.cljs", :size 663, :size-before 6175}
                                  {:name        "reagent/impl/batching.cljs",
                                   :size        1765,
                                   :size-before 7106}
                                  {:name        "reagent/impl/component.cljs",
                                   :size        4164,
                                   :size-before 19792}
                                  {:name        "reagent/impl/template.cljs",
                                   :size        5015,
                                   :size-before 29510}
                                  {:name "reagent/impl/util.cljs", :size 901, :size-before 24447}
                                  {:name "reagent/ratom.cljs", :size 6489, :size-before 56808}]}
                          {:name "com",
                           :children
                                 [{:name        "com/cognitect/transit.js",
                                   :size        139,
                                   :size-before 26016}
                                  {:name        "com/cognitect/transit/caching.js",
                                   :size        409,
                                   :size-before 4409}
                                  {:name        "com/cognitect/transit/delimiters.js",
                                   :size        21,
                                   :size-before 1062}
                                  {:name        "com/cognitect/transit/eq.js",
                                   :size        1374,
                                   :size-before 5804}
                                  {:name        "com/cognitect/transit/impl/decoder.js",
                                   :size        3390,
                                   :size-before 12914}
                                  {:name        "com/cognitect/transit/impl/reader.js",
                                   :size        283,
                                   :size-before 2131}
                                  {:name        "com/cognitect/transit/types.js",
                                   :size        11809,
                                   :size-before 37079}
                                  {:name        "com/cognitect/transit/util.js",
                                   :size        902,
                                   :size-before 4881}]}],
                   :name "app"}}],
   "0.2"
   [{:id          "main",
     :label       "main",
     :when        1524462609000,
     :size        543957,
     :size-before 3091583,
     :tree
                  {:children
                         [{:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 142897, :size-before 1266240}
                                  {:name "cljs/pprint.cljs", :size 96842, :size-before 521630}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/string.cljs", :size 326, :size-before 14691}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 998, :size-before 97323}
                                  {:name        "goog/dom/browserfeature.js",
                                   :size        81,
                                   :size-before 2420}
                                  {:name        "goog/labs/useragent/browser.js",
                                   :size        34,
                                   :size-before 10621}
                                  {:name        "goog/labs/useragent/engine.js",
                                   :size        89,
                                   :size-before 4701}
                                  {:name        "goog/labs/useragent/platform.js",
                                   :size        177,
                                   :size-before 4962}
                                  {:name        "goog/labs/useragent/util.js",
                                   :size        118,
                                   :size-before 4306}
                                  {:name "goog/math/integer.js", :size 3766, :size-before 24550}
                                  {:name "goog/object/object.js", :size 142, :size-before 22128}
                                  {:name "goog/reflect/reflect.js", :size 79, :size-before 4627}
                                  {:name "goog/string/string.js", :size 782, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}
                                  {:name        "goog/useragent/useragent.js",
                                   :size        704,
                                   :size-before 16626}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3369,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        207,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        180,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 847}
                                  {:name "shadow/js.js", :size 1095, :size-before 3507}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 58, :size-before 3287}
                                  {:name "stu/d3.cljs", :size 348, :size-before 13520}]}],
                   :name "app"}}],
   "0.3"
   [{:id          "main",
     :label       "main",
     :when        1524462609000,
     :size        689517,
     :size-before 2904395,
     :tree
                  {:children
                         [{:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 162214, :size-before 1266240}
                                  {:name "cljs/pprint.cljs", :size 98721, :size-before 521630}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/set.cljs", :size 540, :size-before 14703}
                                  {:name "clojure/string.cljs", :size 1828, :size-before 14691}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 1001, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 3766, :size-before 24550}
                                  {:name "goog/object/object.js", :size 153, :size-before 22128}
                                  {:name "goog/string/string.js", :size 194, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3369,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/EventListener.js",
                                   :size        538,
                                   :size-before 540}
                                  {:name        "node_modules/fbjs/lib/ExecutionEnvironment.js",
                                   :size        354,
                                   :size-before 355}
                                  {:name        "node_modules/fbjs/lib/containsNode.js",
                                   :size        304,
                                   :size-before 305}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/focusNode.js",
                                   :size        121,
                                   :size-before 122}
                                  {:name        "node_modules/fbjs/lib/getActiveElement.js",
                                   :size        253,
                                   :size-before 254}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/fbjs/lib/isNode.js",
                                   :size        293,
                                   :size-before 294}
                                  {:name        "node_modules/fbjs/lib/isTextNode.js",
                                   :size        171,
                                   :size-before 172}
                                  {:name        "node_modules/fbjs/lib/shallowEqual.js",
                                   :size        448,
                                   :size-before 449}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-dom/cjs/react-dom.production.min.js",
                                   :size        101439,
                                   :size-before 101633}
                                  {:name        "node_modules/react-dom/index.js",
                                   :size        395,
                                   :size-before 352}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        207,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        182,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "reagent",
                           :children
                                 [{:name "reagent/core.cljs", :size 54, :size-before 23218}
                                  {:name "reagent/debug.cljs", :size 871, :size-before 3054}
                                  {:name "reagent/dom.cljs", :size 565, :size-before 6175}
                                  {:name        "reagent/impl/batching.cljs",
                                   :size        1765,
                                   :size-before 7106}
                                  {:name        "reagent/impl/component.cljs",
                                   :size        4164,
                                   :size-before 19792}
                                  {:name        "reagent/impl/template.cljs",
                                   :size        5022,
                                   :size-before 29510}
                                  {:name "reagent/impl/util.cljs", :size 822, :size-before 24447}
                                  {:name "reagent/ratom.cljs", :size 6493, :size-before 56808}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 951}
                                  {:name "shadow/js.js", :size 1100, :size-before 3507}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 53, :size-before 5645}
                                  {:name "stu/d3.cljs", :size 348, :size-before 13720}]}],
                   :name "app"}}],
   "latest"
   [{:id          "shared",
     :label       "shared",
     :when        1524550387000,
     :size        408701,
     :size-before 3019685,
     :tree
                  {:children
                         [{:name     " [synthetic:1] ",
                           :children [{:name " [synthetic:1] ", :size 75}]}
                          {:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 105979, :size-before 1266240}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 791, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 4045, :size-before 24550}
                                  {:name "goog/math/long.js", :size 30, :size-before 30213}
                                  {:name "goog/object/object.js", :size 145, :size-before 22128}
                                  {:name "goog/string/string.js", :size 145, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}
                                  {:name        "goog/string/stringformat.js",
                                   :size        655,
                                   :size-before 8174}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3376,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        214,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        180,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/shared.js", :size 131}
                                  {:name "shadow/js.js", :size 1095, :size-before 3507}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/d3.cljs", :size 1022, :size-before 20279}]}],
                   :name "app"}}
    {:id          "main",
     :label       "main",
     :when        1524550387000,
     :size        231189,
     :size-before 3019685,
     :tree
                  {:children
                         [{:name "cognitect",
                           :children
                                 [{:name        "cognitect/transit.cljs",
                                   :size        1903,
                                   :size-before 42731}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/set.cljs", :size 540, :size-before 14703}
                                  {:name "clojure/string.cljs", :size 1124, :size-before 14691}]}
                          {:name     " [synthetic:1] ",
                           :children [{:name " [synthetic:1] ", :size 33}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/fbjs/lib/EventListener.js",
                                   :size        538,
                                   :size-before 540}
                                  {:name        "node_modules/fbjs/lib/ExecutionEnvironment.js",
                                   :size        354,
                                   :size-before 355}
                                  {:name        "node_modules/fbjs/lib/containsNode.js",
                                   :size        304,
                                   :size-before 305}
                                  {:name        "node_modules/fbjs/lib/focusNode.js",
                                   :size        121,
                                   :size-before 122}
                                  {:name        "node_modules/fbjs/lib/getActiveElement.js",
                                   :size        253,
                                   :size-before 254}
                                  {:name        "node_modules/fbjs/lib/isNode.js",
                                   :size        293,
                                   :size-before 294}
                                  {:name        "node_modules/fbjs/lib/isTextNode.js",
                                   :size        171,
                                   :size-before 172}
                                  {:name        "node_modules/fbjs/lib/shallowEqual.js",
                                   :size        448,
                                   :size-before 449}
                                  {:name        "node_modules/react-dom/cjs/react-dom.production.min.js",
                                   :size        101439,
                                   :size-before 101633}
                                  {:name        "node_modules/react-dom/index.js",
                                   :size        395,
                                   :size-before 352}
                                  {:name        "node_modules/react/index.js",
                                   :size        2,
                                   :size-before 133}]}
                          {:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 32396, :size-before 1266240}
                                  {:name        "cljs/spec/alpha.cljs",
                                   :size        29621,
                                   :size-before 290821}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 811}
                                  {:name "shadow/js.js", :size 5, :size-before 3507}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/base.js", :size 239, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 270, :size-before 24550}
                                  {:name "goog/math/long.js", :size 4313, :size-before 30213}
                                  {:name "goog/object/object.js", :size 8, :size-before 22128}
                                  {:name "goog/reflect/reflect.js", :size 83, :size-before 4627}
                                  {:name "goog/string/string.js", :size 81, :size-before 53241}
                                  {:name        "goog/string/stringformat.js",
                                   :size        408,
                                   :size-before 8174}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 7063, :size-before 31653}
                                  {:name "stu/core.cljc", :size 5294, :size-before 31238}
                                  {:name "stu/d3.cljs", :size 4452, :size-before 20279}]}
                          {:name "reagent",
                           :children
                                 [{:name "reagent/core.cljs", :size 78, :size-before 23218}
                                  {:name "reagent/debug.cljs", :size 867, :size-before 3054}
                                  {:name "reagent/dom.cljs", :size 663, :size-before 6175}
                                  {:name        "reagent/impl/batching.cljs",
                                   :size        1770,
                                   :size-before 7106}
                                  {:name        "reagent/impl/component.cljs",
                                   :size        4164,
                                   :size-before 19792}
                                  {:name        "reagent/impl/template.cljs",
                                   :size        5015,
                                   :size-before 29510}
                                  {:name "reagent/impl/util.cljs", :size 854, :size-before 24447}
                                  {:name "reagent/ratom.cljs", :size 6489, :size-before 56808}]}
                          {:name "com",
                           :children
                                 [{:name        "com/cognitect/transit.js",
                                   :size        139,
                                   :size-before 26016}
                                  {:name        "com/cognitect/transit/caching.js",
                                   :size        409,
                                   :size-before 4409}
                                  {:name        "com/cognitect/transit/delimiters.js",
                                   :size        21,
                                   :size-before 1062}
                                  {:name        "com/cognitect/transit/eq.js",
                                   :size        1374,
                                   :size-before 5804}
                                  {:name        "com/cognitect/transit/impl/decoder.js",
                                   :size        3390,
                                   :size-before 12914}
                                  {:name        "com/cognitect/transit/impl/reader.js",
                                   :size        283,
                                   :size-before 2131}
                                  {:name        "com/cognitect/transit/types.js",
                                   :size        11809,
                                   :size-before 37079}
                                  {:name        "com/cognitect/transit/util.js",
                                   :size        902,
                                   :size-before 4881}]}],
                   :name "app"}}],
   "0.4"
   [{:id          "main",
     :label       "main",
     :when        1524462609000,
     :size        689517,
     :size-before 2904890,
     :tree
                  {:children
                         [{:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 162214, :size-before 1266240}
                                  {:name "cljs/pprint.cljs", :size 98721, :size-before 521630}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/set.cljs", :size 540, :size-before 14703}
                                  {:name "clojure/string.cljs", :size 1828, :size-before 14691}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 1001, :size-before 97323}
                                  {:name "goog/math/integer.js", :size 3766, :size-before 24550}
                                  {:name "goog/object/object.js", :size 153, :size-before 22128}
                                  {:name "goog/string/string.js", :size 194, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}]}
                          {:name "node_modules",
                           :children
                                 [{:name        "node_modules/create-react-class/factory.js",
                                   :size        4931,
                                   :size-before 4941}
                                  {:name        "node_modules/create-react-class/index.js",
                                   :size        484,
                                   :size-before 432}
                                  {:name        "node_modules/d3-array/build/d3-array.js",
                                   :size        5816,
                                   :size-before 5828}
                                  {:name        "node_modules/d3-axis/build/d3-axis.js",
                                   :size        2909,
                                   :size-before 2915}
                                  {:name        "node_modules/d3-brush/build/d3-brush.js",
                                   :size        8741,
                                   :size-before 8759}
                                  {:name        "node_modules/d3-chord/build/d3-chord.js",
                                   :size        2780,
                                   :size-before 2786}
                                  {:name        "node_modules/d3-collection/build/d3-collection.js",
                                   :size        2819,
                                   :size-before 2825}
                                  {:name        "node_modules/d3-color/build/d3-color.js",
                                   :size        10066,
                                   :size-before 10086}
                                  {:name        "node_modules/d3-contour/dist/d3-contour.js",
                                   :size        5582,
                                   :size-before 5594}
                                  {:name        "node_modules/d3-dispatch/build/d3-dispatch.js",
                                   :size        1802,
                                   :size-before 1806}
                                  {:name        "node_modules/d3-drag/build/d3-drag.js",
                                   :size        3779,
                                   :size-before 3787}
                                  {:name        "node_modules/d3-dsv/build/d3-dsv.js",
                                   :size        2042,
                                   :size-before 2047}
                                  {:name        "node_modules/d3-ease/build/d3-ease.js",
                                   :size        3073,
                                   :size-before 3080}
                                  {:name        "node_modules/d3-fetch/dist/d3-fetch.js",
                                   :size        1563,
                                   :size-before 1567}
                                  {:name        "node_modules/d3-force/build/d3-force.js",
                                   :size        8000,
                                   :size-before 8016}
                                  {:name        "node_modules/d3-format/build/d3-format.js",
                                   :size        4607,
                                   :size-before 4617}
                                  {:name        "node_modules/d3-geo/dist/d3-geo.js",
                                   :size        35475,
                                   :size-before 35545}
                                  {:name        "node_modules/d3-hierarchy/dist/d3-hierarchy.js",
                                   :size        13298,
                                   :size-before 13325}
                                  {:name        "node_modules/d3-interpolate/build/d3-interpolate.js",
                                   :size        7123,
                                   :size-before 7138}
                                  {:name        "node_modules/d3-path/build/d3-path.js",
                                   :size        2128,
                                   :size-before 2133}
                                  {:name        "node_modules/d3-polygon/build/d3-polygon.js",
                                   :size        1560,
                                   :size-before 1564}
                                  {:name        "node_modules/d3-quadtree/build/d3-quadtree.js",
                                   :size        5418,
                                   :size-before 5429}
                                  {:name        "node_modules/d3-random/build/d3-random.js",
                                   :size        1285,
                                   :size-before 1288}
                                  {:name
                                                "node_modules/d3-scale-chromatic/dist/d3-scale-chromatic.js",
                                   :size        18716,
                                   :size-before 18745}
                                  {:name        "node_modules/d3-scale/dist/d3-scale.js",
                                   :size        11494,
                                   :size-before 11517}
                                  {:name        "node_modules/d3-selection/dist/d3-selection.js",
                                   :size        13235,
                                   :size-before 13262}
                                  {:name        "node_modules/d3-shape/build/d3-shape.js",
                                   :size        28529,
                                   :size-before 28585}
                                  {:name        "node_modules/d3-time-format/build/d3-time-format.js",
                                   :size        8903,
                                   :size-before 8921}
                                  {:name        "node_modules/d3-time/build/d3-time.js",
                                   :size        5663,
                                   :size-before 5675}
                                  {:name        "node_modules/d3-timer/build/d3-timer.js",
                                   :size        1818,
                                   :size-before 1822}
                                  {:name        "node_modules/d3-transition/build/d3-transition.js",
                                   :size        10318,
                                   :size-before 10339}
                                  {:name        "node_modules/d3-voronoi/build/d3-voronoi.js",
                                   :size        9033,
                                   :size-before 9051}
                                  {:name        "node_modules/d3-zoom/build/d3-zoom.js",
                                   :size        9260,
                                   :size-before 9279}
                                  {:name        "node_modules/d3/dist/d3.node.js",
                                   :size        3369,
                                   :size-before 3339}
                                  {:name        "node_modules/fbjs/lib/EventListener.js",
                                   :size        538,
                                   :size-before 540}
                                  {:name        "node_modules/fbjs/lib/ExecutionEnvironment.js",
                                   :size        354,
                                   :size-before 355}
                                  {:name        "node_modules/fbjs/lib/containsNode.js",
                                   :size        304,
                                   :size-before 305}
                                  {:name        "node_modules/fbjs/lib/emptyFunction.js",
                                   :size        323,
                                   :size-before 324}
                                  {:name        "node_modules/fbjs/lib/emptyObject.js",
                                   :size        88,
                                   :size-before 89}
                                  {:name        "node_modules/fbjs/lib/focusNode.js",
                                   :size        121,
                                   :size-before 122}
                                  {:name        "node_modules/fbjs/lib/getActiveElement.js",
                                   :size        253,
                                   :size-before 254}
                                  {:name        "node_modules/fbjs/lib/invariant.js",
                                   :size        404,
                                   :size-before 405}
                                  {:name        "node_modules/fbjs/lib/isNode.js",
                                   :size        293,
                                   :size-before 294}
                                  {:name        "node_modules/fbjs/lib/isTextNode.js",
                                   :size        171,
                                   :size-before 172}
                                  {:name        "node_modules/fbjs/lib/shallowEqual.js",
                                   :size        448,
                                   :size-before 449}
                                  {:name        "node_modules/object-assign/index.js",
                                   :size        981,
                                   :size-before 983}
                                  {:name        "node_modules/query-selector/index.js",
                                   :size        144,
                                   :size-before 145}
                                  {:name        "node_modules/query-selector/lib/query-selector.js",
                                   :size        6328,
                                   :size-before 6341}
                                  {:name
                                                "node_modules/query-selector/lib/query-selector/parser.js",
                                   :size        11136,
                                   :size-before 11158}
                                  {:name        "node_modules/query-selector/lib/query-selector/util.js",
                                   :size        3901,
                                   :size-before 3909}
                                  {:name        "node_modules/react-dom/cjs/react-dom.production.min.js",
                                   :size        101439,
                                   :size-before 101633}
                                  {:name        "node_modules/react-dom/index.js",
                                   :size        395,
                                   :size-before 352}
                                  {:name        "node_modules/react-faux-dom/lib/ReactFauxDOM.js",
                                   :size        207,
                                   :size-before 155}
                                  {:name        "node_modules/react-faux-dom/lib/_element.js",
                                   :size        5315,
                                   :size-before 5326}
                                  {:name        "node_modules/react-faux-dom/lib/_window.js",
                                   :size        186,
                                   :size-before 187}
                                  {:name        "node_modules/react-faux-dom/lib/_withFauxDOM.js",
                                   :size        1579,
                                   :size-before 1582}
                                  {:name        "node_modules/react-faux-dom/lib/factory.js",
                                   :size        519,
                                   :size-before 521}
                                  {:name        "node_modules/react-faux-dom/lib/utils/assign.js",
                                   :size        192,
                                   :size-before 193}
                                  {:name        "node_modules/react-faux-dom/lib/utils/camelCase.js",
                                   :size        221,
                                   :size-before 222}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isString.js",
                                   :size        137,
                                   :size-before 138}
                                  {:name        "node_modules/react-faux-dom/lib/utils/isUndefined.js",
                                   :size        143,
                                   :size-before 144}
                                  {:name        "node_modules/react-faux-dom/lib/utils/mapValues.js",
                                   :size        181,
                                   :size-before 182}
                                  {:name
                                                "node_modules/react-faux-dom/lib/utils/styleCamelCase.js",
                                   :size        343,
                                   :size-before 344}
                                  {:name        "node_modules/react/cjs/react.production.min.js",
                                   :size        5335,
                                   :size-before 5346}
                                  {:name        "node_modules/react/index.js",
                                   :size        182,
                                   :size-before 133}
                                  {:name        "node_modules/style-attr/lib/index.js",
                                   :size        703,
                                   :size-before 705}]}
                          {:name "reagent",
                           :children
                                 [{:name "reagent/core.cljs", :size 54, :size-before 23218}
                                  {:name "reagent/debug.cljs", :size 871, :size-before 3054}
                                  {:name "reagent/dom.cljs", :size 565, :size-before 6175}
                                  {:name        "reagent/impl/batching.cljs",
                                   :size        1765,
                                   :size-before 7106}
                                  {:name        "reagent/impl/component.cljs",
                                   :size        4164,
                                   :size-before 19792}
                                  {:name        "reagent/impl/template.cljs",
                                   :size        5022,
                                   :size-before 29510}
                                  {:name "reagent/impl/util.cljs", :size 822, :size-before 24447}
                                  {:name "reagent/ratom.cljs", :size 6493, :size-before 56808}]}
                          {:name "shadow",
                           :children
                                 [{:name "shadow/cljs/constants/main.js", :size 951}
                                  {:name "shadow/js.js", :size 1100, :size-before 3507}]}
                          {:name "stu",
                           :children
                                 [{:name "stu/app.cljs", :size 53, :size-before 6015}
                                  {:name "stu/d3.cljs", :size 348, :size-before 13845}]}],
                   :name "app"}}],
   "0.1"
   [{:id          "main",
     :label       "main",
     :when        1524462609000,
     :size        245083,
     :size-before 2776891,
     :tree
                  {:children
                         [{:name "cljs",
                           :children
                                 [{:name "cljs/core.cljs", :size 141087, :size-before 1266240}
                                  {:name "cljs/pprint.cljs", :size 95433, :size-before 521630}]}
                          {:name "clojure",
                           :children
                                 [{:name "clojure/string.cljs", :size 322, :size-before 14691}]}
                          {:name "goog",
                           :children
                                 [{:name "goog/array/array.js", :size 101, :size-before 59394}
                                  {:name "goog/base.js", :size 996, :size-before 97323}
                                  {:name        "goog/dom/browserfeature.js",
                                   :size        81,
                                   :size-before 2420}
                                  {:name        "goog/labs/useragent/browser.js",
                                   :size        34,
                                   :size-before 10621}
                                  {:name        "goog/labs/useragent/engine.js",
                                   :size        89,
                                   :size-before 4701}
                                  {:name        "goog/labs/useragent/platform.js",
                                   :size        177,
                                   :size-before 4962}
                                  {:name        "goog/labs/useragent/util.js",
                                   :size        118,
                                   :size-before 4306}
                                  {:name "goog/math/integer.js", :size 3725, :size-before 24550}
                                  {:name "goog/object/object.js", :size 142, :size-before 22128}
                                  {:name "goog/reflect/reflect.js", :size 79, :size-before 4627}
                                  {:name "goog/string/string.js", :size 782, :size-before 53241}
                                  {:name        "goog/string/stringbuffer.js",
                                   :size        308,
                                   :size-before 2701}
                                  {:name        "goog/useragent/useragent.js",
                                   :size        704,
                                   :size-before 16626}]}
                          {:name     "shadow",
                           :children [{:name "shadow/cljs/constants/main.js", :size 847}]}
                          {:name     "stu",
                           :children [{:name "stu/app.cljs", :size 58, :size-before 197}]}],
                   :name "app"}}]})
