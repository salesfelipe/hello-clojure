(ns test.core
  (:gen-class))

(defn tamanho-nome
  [nomes]
  (map count nomes))

;; DESAFIO: Crie uma funcao que recebe um vetor de nomes e retorne o
;; tamanho medio dos nomes, mas deve-se ignorar nome com 3 ou menos caracteres.
(defn tamanho-medio-nomes
  "Calcula tamanho medio dos nomes"
  [nomes]
  (let [tamanhoNomes (filter #(< 3 %) (tamanho-nome nomes))
        total (count tamanhoNomes)]
    (if (> total 0) (/ (reduce + tamanhoNomes) total) 0)))