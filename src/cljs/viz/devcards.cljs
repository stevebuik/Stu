(ns viz.devcards
  (:require
    [devcards.core :as dc :include-macros true]
    [viz.cards-d3]
    [viz.cards-app]))

(defn ^:export init []
  (dc/start-devcard-ui!))
