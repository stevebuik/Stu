(ns viz.devcards
  (:require
    [devcards.core :as dc :include-macros true]
    [viz.cards-d3]))

(defn ^:export init []
  (dc/start-devcard-ui!))
