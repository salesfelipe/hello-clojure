(ns test.ex-coordinate-transformation
  (:require [clojure.test :refer :all]
            [exercises.exercism-coordinate-transformation :refer 
             [translate2d scale2d compose-transform memoize-transform]]))

(deftest check-approx-average
  
  (testing "should be reusable" 
    (is (let [dx 3 
              dy -5 
              translator (translate2d dx dy) 
              x2 4 
              y2 5 
              reusedExpected [7 0]] 
          (= reusedExpected (translator x2 y2))))) 
  (testing "should be predictable" 
    (is (let [dx 3 dy -5 translator (translate2d dx dy) x1 0 y1 0 expected [3 -5]] (= expected (translator x1 y1))))))
    