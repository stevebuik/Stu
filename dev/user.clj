(ns user
  (:require
    [shadow.cljs.devtools.server :as server]
    [shadow.cljs.devtools.api :as shadow]
    [me.raynes.fs :as fs]
    [stu.illuminate :as illuminate]))

(defn start-dev!
  []
  (server/start!)                                           ; starts the shadow repl server

  ; starts the code watchers
  (shadow/watch :devcards)
  (shadow/watch :app))

(defn update-sample!
  "generate a stu html artifact for the Stu app"
  []
  (shadow/release :app)
  (fs/copy "resources/public/app/main.js" "resources/stu-app-release.js")
  (illuminate/generate-sample!))

(comment
  ; change the tag below each time to create a snapshot history
  (shadow/release-snapshot :app {:tag "0.8"})

  ; or this to generate "latest"
  (shadow/release-snapshot :app {})

  ; run below command to build release artifact
  (shadow/release :app)
  )

