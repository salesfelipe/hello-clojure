(ns exercises.core
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


(defn concat-rounds
  "Takes two lists and returns a single `list` 
   consisting of all the rounds in the first `list`, 
   followed by all the rounds in the second `list`"
  [l1 l2]
  (concat l1 l2))

(defn contains-round?
  "Takes a list of rounds played and a round number.
   Returns `true` if the round is in the list, `false` if not."
  [l n]
  (some? (some #(= n %) l)))

(defn card-average
  "Returns the average value of a hand"
  [hand]
  (double (/ (reduce + hand) (count hand))))

(defn median [cards]
  (let [sorted (sort cards)
        cnt (count cards)
        half (quot cnt 2)]
    (if (odd? cnt) (nth sorted half)
        (let [bottom (dec half)
              bottom-value (nth sorted bottom)
              upper-value (nth sorted half)]
          (/ (+ bottom-value upper-value) 2)))))


(defn approx-average?
  "Returns `true` if average is equal to either one of:
  - Take the average of the _first_ and _last_ number in the hand.
  - Using the median (middle card) of the hand."
  [hand]
  (let [average (card-average hand)]
    ()))