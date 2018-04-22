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

  Only the top two states (multiple  single) should be seen in normal use.
  The empty state means that the page generation failed to find any source data to transform.
  The invalid state means that the page generation succeeded but did not create valid data for the app.
  ")

(def snap1 {:id    "1"
            :label "gen1"
            :when  (.getTime (js/Date.))
            :size  800
            :tree  {:name     "flare"
                    :children [{:name     "analytics"
                                :children [{:name     "cluster"
                                            :children [{:name "agg" :size 2000}
                                                       {:name "comm" :size 3000}
                                                       {:name "heir" :size 4000}
                                                       {:name "merge" :size 3000}]}
                                           {:name     "graph"
                                            :children [{:name "between" :size 3000}
                                                       {:name "link" :size 8000}]}]}]}})
(def snap2 {:id    "2"
            :label "gen2"
            :when  (.getTime (js/Date.))
            :size  900
            :tree  (update (:tree snap1) :children conj {:name "new1" :size 10000})})

(def snap3 {:id    "3"
            :label "gen3"
            :when  (.getTime (js/Date.))
            :size  1250
            :tree  (update (:tree snap2) :children conj {:name "new2" :size 2000})})

(def db [snap3 snap2 snap1])

(defn summary
  [snap]
  (-> snap
      (select-keys [:id :label :size :when])
      (set/rename-keys {:size :value})))

(defn snap [id] (->> db
                     (filter #(= id (:id %)))
                     first))

(defcard multiple-snapshots
         (r/as-element [app/app-component (reify app/Source
                                            (snapshots [_] (mapv summary db))
                                            (snapshot [_ id] (snap id)))
                        "Fake CLJS App"]))

(defcard single-snapshot
         (r/as-element [app/app-component (reify app/Source
                                            (snapshots [_] (mapv summary (take 1 db)))
                                            (snapshot [_ id] (snap id)))
                        "Fake CLJS App"]))

#_#_#_(defcard empty-state
               (app/app-component (reify app/Source
                                    (snapshots [_] [])
                                    (snapshot [_ id] {}))
                                  "Fake CLJS App"))

    (defcard invalid-summary-data
             (app/app-component (reify app/Source
                                  (snapshots [_] [])
                                  (snapshot [_ id] {}))
                                "Fake CLJS App"))

    (defcard invalid-snapshot-data
             (app/app-component (reify app/Source
                                  (snapshots [_] [])
                                  (snapshot [_ id] {}))
                                "Fake CLJS App"))




