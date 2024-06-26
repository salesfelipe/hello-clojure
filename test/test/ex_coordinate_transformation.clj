(ns test.ex-coordinate-transformation
  (:require [clojure.test :refer :all]
            [exercises.exercism-coordinate-transformation :refer 
             [translate2d scale2d compose-transform memoize-transform]]))

(deftest check-translate2d
  (testing "should be reusable"
    (is (let [dx 3
              dy -5
              translator (translate2d dx dy)
              x2 4
              y2 5
              reusedExpected [7 0]]
          (= reusedExpected (translator x2 y2)))))
  (testing "should be predictable"
    (is (let [dx 3
              dy -5
              translator
              (translate2d dx dy)
              x1 0 y1 0
              expected [3 -5]]
          (= expected (translator x1 y1)))))
  )

(deftest check-scale2d
  (testing "should be predictable"
    (is (let [dx 4
              dy 2
              scaler (scale2d dx dy)
              x1 1
              y1 1
              expected [4 2]]
          (= expected (scaler x1 y1))))))

(deftest check-compose-transform 
  (testing "should return a function" 
    (is (let [dx -6 
              dy 10 
              translator (translate2d dx dy) 
              sx 3 
              sy 2
              scaler (scale2d sx sy)] 
          (true? (function? (compose-transform translator scaler))))))
  (testing "should compose two translate functions" 
    (is (let [dx -6 dy 10 
              translator (translate2d dx dy) 
              compose-translate (compose-transform translator translator)] 
          (= [-12 20] (compose-translate 0 0)))))
)

