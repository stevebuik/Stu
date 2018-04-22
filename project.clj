(defproject stu "0.1.0-SNAPSHOT"
  :description "Visualise builds of Clojurescript artifacts"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [sablono "0.8.3"]
                 [reagent "0.8.0-alpha2" :exclusions [cljsjs/create-react-class
                                                      cljsjs/react-dom-server
                                                      cljsjs/react-dom
                                                      cljsjs/react
                                                      org.clojure/clojurescript]]]

  :clean-targets ^{:protect false} ["resources/public/app"
                                    "resources/public/devcards"
                                    "target"]

  :source-paths ["src/clj" "src/cljs"]

  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[binaryage/devtools "0.9.8"]

                                  ; keep in sync with package.json
                                  [thheller/shadow-cljs "2.2.26"]

                                  [devcards "0.2.4" :exclusions [cljsjs/react
                                                                 cljsjs/react-dom
                                                                 com.cognitect/transit-clj
                                                                 com.cognitect/transit-cljs]]]}}
  )
