(ns test.imc-test
  (:require [clojure.test :refer :all]
            [exercises.imc :refer :all]))

(deftest confere-imc
  (testing "IMC baixo"
    (is (= :baixo (confere-imc 1.71 30))))
  (testing "IMC alto"
    (is (= :alto (confere-imc 1.71 90))))
  (testing "IMC ideal"
    (is (= :alto (confere-imc 1.71 60)))))
    
