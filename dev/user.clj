(ns user
  (:require
    [shadow.cljs.devtools.server :as server]
    [shadow.cljs.devtools.api :as shadow]))

(comment

  (server/start!)                                           ; starts the shadow repl server

  ; starts the code watcher
  (shadow/watch :devcards)
  (shadow/watch :app)

  )