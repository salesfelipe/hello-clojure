(ns test.ex-elyses-destructured-enchantments
  (:require [clojure.test :refer :all]
            [exercises.exercism-elyses-destructured-enchantments :refer
             [first-card second-card swap-top-two-cards discard-top-card]]))


(deftest check-first-card
  (testing "Get the first card"
    (is (= 6 (first-card [6 5 5 11 2 5 0])))))

(deftest check-second-card
  (testing "Get the second card"
    (is (= 5 (second-card [6 5 5 11 2 5 0])))))

(deftest check-swap-top-two-cards
  (is (= [6 3] (swap-top-two-cards [3 6]))))

(deftest check-discard-top-card
  (is (= [3 [6]] (discard-top-card [3 6])) 
      (is (= [7 nil] (discard-top-card [7])))))