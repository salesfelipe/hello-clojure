(ns test.ex-bird-watcher-test
  (:require [clojure.test :refer :all]
            [exercises.exercism-bird-watcher :refer
             [last-week today inc-bird 
              day-without-birds? n-days-count 
              busy-days odd-week?]]))

(deftest check-last-week
  (is (= [0 2 5 3 7 8 4] last-week)))

(deftest check-today
  (is (= 1 (today [2 5 0 7 4 1]))))

(deftest check-inc-bird
  (testing "Increment today's count with no previous visits" 
    (is (= [6 5 5 11 2 5 1] (inc-bird [6 5 5 11 2 5 0])))))

(deftest check-day-without-birds
  (testing "Has day without birds with day without birds" 
    (is (= true (day-without-birds? [5 5 4 0 7 6 7])))))

(deftest check-n-days-count
  (testing "Count for first three days of disappointing week" 
    (is (= 1 (n-days-count [0 0 1 0 0 1 0] 3)))))

(deftest check-busy-days
  (testing "Busy days for disappointing week" 
    (is (= 0 (busy-days [1 1 1 0 0 0 0])))))

(deftest check-odd-week
  (testing "Odd week for week matching odd pattern" 
    (is (= true (odd-week? [1 0 1 0 1 0 1])))))