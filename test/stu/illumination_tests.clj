(ns stu.illumination-tests
  (:require
    [clojure.pprint :refer [pprint]]
    [clojure.test :refer :all]
    [clojure.spec.alpha :as s]
    [clojure.spec.test.alpha :as st]
    [viz.core :as viz]
    [stu.illuminate :as illuminate]))

(s/check-asserts true)
(st/instrument)

(def latest-bundle ".shadow-cljs/release-snapshots/app/latest/bundle-info.edn")

; NOTE : these tests all assume that there is at least a "latest" bundle in the .shadow-cljs dir.
; to generate a "latest", use the commented exprs in the user ns.

(deftest latest-generates-valid-snapshot
  (is (->>
        (illuminate/shadow-bundle->snapshot latest-bundle)
        (s/explain-data ::viz/snapshot)
        nil?)
      "latest bundle for this app generates a valid snapshot"))

(deftest latest-generates-valid-summary
  (is (->>
        (illuminate/shadow-bundle->summary latest-bundle)
        (s/explain-data ::viz/summary)
        nil?)
      "latest bundle for this app generates a valid summary"))


