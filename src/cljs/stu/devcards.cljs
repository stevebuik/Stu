(ns stu.devcards
  (:require
    [devcards.core :as dc :include-macros true]
    [stu.cards-d3]
    [stu.cards-app]))

(defn ^:export init []
  (dc/start-devcard-ui!))
