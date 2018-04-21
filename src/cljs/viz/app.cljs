(ns viz.app
  (:require
    [cljs.pprint :refer [pprint]]
    [sablono.core :include-macros true :refer [html]]))

(defn ^:export init []
  (pprint "start the engines"))
