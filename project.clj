(defproject stu "0.1.0-SNAPSHOT"
  :description "Visualise builds of Clojurescript artifacts"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/spec.alpha "0.1.143"]
                 [reagent "0.8.0-alpha2" :exclusions [cljsjs/create-react-class
                                                      cljsjs/react-dom-server
                                                      cljsjs/react-dom
                                                      cljsjs/react
                                                      org.clojure/clojurescript]]
                 [org.clojure/data.json "0.2.6"]
                 [com.cognitect/transit-clj "0.8.303"]
                 [com.cognitect/transit-cljs "0.8.256"]
                 [me.raynes/fs "1.4.6"]
                 [org.clojure/tools.cli "0.3.6"]]

  :clean-targets ^{:protect false} ["resources/public/app"
                                    "resources/public/devcards"
                                    "target"]

  :source-paths ["src/clj" "src/cljs" "src/cljc"]

  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[binaryage/devtools "0.9.8"]

                                  ; keep in sync with package.json
                                  [thheller/shadow-cljs "2.2.26"]

                                  [devcards "0.2.4" :exclusions [cljsjs/react
                                                                 cljsjs/react-dom
                                                                 com.cognitect/transit-clj
                                                                 com.cognitect/transit-cljs]]]}}
  )
