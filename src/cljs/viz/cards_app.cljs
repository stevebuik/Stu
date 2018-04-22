(ns viz.cards-app
  (:require
    [cljs.pprint :refer [pprint]]
    [devcards.core :as dc :include-macros true :refer-macros [defcard defcard-doc deftest]]
    [reagent.core :as r]
    [viz.app :as app]
    [clojure.set :as set]))

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
            :data      (update (:data snap1) :children conj {:name "new1" :size 10000})})

(def snap3 {:id        12345
            :label     "gen3"
            :generated (js/Date.)
            :size      28000
            :data      (update (:data snap2) :children conj {:name "new2" :size 2000})})

(def db [snap3 snap2 snap1])

(defn summary
  [snap]
  (-> snap
      (select-keys [:id :label :size :generated])
      (set/rename-keys {:size      :value
                        :generated :when})))

(defcard multiple-snapshots
         (r/as-element [app/app-component (reify app/Source
                                            (snapshots [_] (mapv summary db))
                                            (snapshot [_ id] (->> db
                                                                  (filter #(= id (:id %)))
                                                                  first)))
                        "Mock CLJS App"]))

#_#_(defcard single-snapshot
             (app/app-component (reify app/Source
                                  (snapshots [_] [])
                                  (snapshot [_ id] {}))
                                ))

    (defcard empty-state
             (app/app-component (reify app/Source
                                  (snapshots [_] [])
                                  (snapshot [_ id] {}))
                                ))




