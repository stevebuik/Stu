(ns stu.cards-app
  (:require
    [devcards.core :as dc :include-macros true :refer-macros [defcard defcard-doc deftest]]
    [reagent.core :as r]
    [stu.app :as app]
    [clojure.set :as set]
    [stu.sample-data :as sample]))

(defcard-doc
  "
  ## release stu app in various states

  Only the top two states (multiple and single) should be seen in normal use.
  The empty state means that the page generation failed to find any source data to transform.
  The invalid state means that the page generation succeeded but did not create valid data for the app.

  The sources used in these cards couple the app code and the sample-data together.
  The generated app differs in that the app code and the data is de-coupled.
  ")

(defcard multiple-snapshots
         (r/as-element [app/app-component (reify app/Source
                                            (title [_] "many snapshots")
                                            (snapshots [_] sample/summaries)
                                            (snapshot [_ id]
                                              (get sample/snapshots id)))
                        "Fake CLJS App"]))

(defcard single-snapshot
         (r/as-element [app/app-component (reify app/Source
                                            (title [_] "one snapshot")
                                            (snapshots [_] (take 1 sample/summaries))
                                            (snapshot [_ id]
                                              (get sample/snapshots id)))
                        "Fake CLJS App"]))

(defcard empty-state
         (r/as-element [app/app-component (reify app/Source
                                            (title [_] "empty")
                                            (snapshots [_] nil)
                                            (snapshot [_ id] nil))]))

(defcard invalid-summary-data
         (r/as-element [app/app-component (reify app/Source
                                            (title [_] "empty")
                                            (snapshots [_] [:bad-summary])
                                            (snapshot [_ id] {}))]))

(defcard invalid-snapshot-data
         (r/as-element [app/app-component (reify app/Source
                                            (title [_] "bad")
                                            (snapshots [_] (take 2 sample/summaries))
                                            (snapshot [_ id] {}))]))




