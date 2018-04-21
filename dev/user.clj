(ns user
  (:require
    [shadow.cljs.devtools.server :as server]
    [shadow.cljs.devtools.api :as shadow]))

(defn start-dev!
  []
  (server/start!)                                           ; starts the shadow repl server

  ; starts the code watchers
  (shadow/watch :devcards)
  (shadow/watch :app))

(comment
  ; change the tag below each time to create a snapshot history
  (shadow/release-snapshot :app {:tag "0.1"})

  ; run below command to build release artifact
  (shadow/release :app)
  )

