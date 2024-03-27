(ns test.ex-card-games-test
  (:require [clojure.test :refer :all]
            [exercises.exercism-card-games :refer 
             [approx-average? average-even-odd? maybe-double-last]]))

(deftest check-approx-average
  (is (= true (approx-average? '(1 2 3))))
  (is (= true (approx-average? '(2 3 4 8 8)))) 
  (is (= false (approx-average? '(1 2 3 5 9)))))
    
(deftest check-average-even-odd
  (is (= true (average-even-odd? '(1 2 3))))
  (is (= false (average-even-odd? '(1 2 3 4)))))
    
(deftest check-maybe-double-last
  (is (= '(1 2 3) (maybe-double-last '(1 2 3))))
  (is (= '(1 2 3 4) (maybe-double-last '(1 2 3 4))))
  (is (= '(1 2 3 4 22) (maybe-double-last '(1 2 3 4 11)))))
