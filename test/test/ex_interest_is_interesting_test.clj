(ns test.ex-interest-is-interesting-test
  (:require [clojure.test :refer :all]
            [exercises.exercism-interest-is-interesting :refer
             [interest-rate 
              annual-balance-update
              amount-to-donate]]))

(deftest check-interest-rate
  (is (= 0.5 (interest-rate 0M)))
  (is (= 2.475 (interest-rate 5000.0000M))))

(deftest check-annual-balance-update
  (is (= 201.75375M (annual-balance-update 200.75M)))
  (is (= 1016.210101621M (annual-balance-update 1000.0001M)))
  (is (= 920352587.26744292868451875M (annual-balance-update 898124017.826243404425M)))
)

(deftest check-amount-to-donate
  (is (= 27 (amount-to-donate 550.5M 2.5))))