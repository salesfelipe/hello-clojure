(ns test.ex-card-games-test
  (:require [clojure.test :refer :all]
            [exercises.exercism-card-games :refer [approx-average? average-even-odd?]]))

(deftest check-approx-average
  (is (= true (approx-average? '(1 2 3))))
  (is (= true (approx-average? '(2 3 4 8 8)))) 
  (is (= false (approx-average? '(1 2 3 5 9)))))
    
(deftest check-average-even-odd
  (is (= true (average-even-odd? '(1 2 3))))
  (is (= false (average-even-odd? '(1 2 3 4)))))

    
