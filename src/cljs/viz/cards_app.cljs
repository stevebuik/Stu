(ns viz.cards-app
  (:require
    [cljs.pprint :refer [pprint]]
    [devcards.core :as dc :include-macros true :refer-macros [defcard defcard-doc deftest]]
    [viz.app :as app]))

(defcard-doc
  "
  ## release viz app in various states
  ")

(def snap1 {:id        123
            :label     "gen1"
            :generated (js/Date.)
            :size      25000
            :data      {:name     "flare"
                        :children [{:name     "analytics"
                                    :children [{:name     "cluster"
                                                :children [{:name "agg" :size 2000}
                                                           {:name "comm" :size 3000}
                                                           {:name "heir" :size 4000}
                                                           {:name "merge" :size 3000}]}
                                               {:name     "graph"
                                                :children [{:name "between" :size 3000}
                                                           {:name "link" :size 8000}]}]}]}})
(def snap2 {:id        1234
            :label     "gen2"
            :generated (js/Date.)
            :size      26000
            :data      (update (:data snap1) :children conj {:name "new" :size 10000})})

(defcard multiple-snapshots
         (app/app-component (reify app/Source
                              (snapshots [_] (->> [snap1 snap2]
                                                  (mapv (juxt :label :size))))
                              (snapshot [_ id] (:data snap1)))
                            1))

#_#_(defcard single-snapshot
             (app/app-component (reify app/Source
                                  (snapshots [_] [])
                                  (snapshot [_ id] {}))
                                1))

    (defcard empty-state
             (app/app-component (reify app/Source
                                  (snapshots [_] [])
                                  (snapshot [_ id] {}))
                                1))




