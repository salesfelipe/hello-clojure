(ns test.core-test
  (:require [clojure.test :refer :all]
            [exercises.core :refer :all]))

(deftest zero
  (is (= 0 (tamanho-medio-nomes []))))

(deftest todos-menores-que-tres
  (is (= 0 (tamanho-medio-nomes ["1" "22" "333"]))))

(deftest media-de-dois-nomes
  (is (= 9/2 (tamanho-medio-nomes ["1" "22" "4444" "55555"]))))