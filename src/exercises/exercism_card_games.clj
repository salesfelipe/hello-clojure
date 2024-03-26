(ns exercises.exercism-card-games)
(require '[clojure.math :refer [floor]])

(defn rounds
  "Takes the current round number and returns 
   a `list` with that round and the _next two_."
  [n]
  (list (+ n 0) (+ n 1) (+ n 2)))

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
  (double
   (/
    (reduce + hand) (count hand))))

(defn- get-even-indexed
  "Returns the values positioned on an even index"
  [hand]
  (keep-indexed #(if (even? %1) %2) hand))

(defn- get-odd-indexed
  "Returns the values positioned on an odd index"
  [hand]
  (keep-indexed #(if (odd? %1) %2) hand))

(defn average-even-odd?
  "Returns true if the average of the cards at even indexes 
   is the same as the average of the cards at odd indexes."
  [hand]
  (let [even-items (get-even-indexed hand)
       odd-items (get-odd-indexed hand)] 
    (== (card-average even-items) (card-average odd-items))))

(defn maybe-double-last
  "If the last card is a Jack (11), doubles its value
   before returning the hand."
  [hand])


(defn- median
  [hand]
  (let [half (floor (/ (count hand) 2))]
    (nth hand half)))

(defn- first-and-last-avg
  [hand]
  (let [first (nth hand 0)
        last (nth hand (- (count hand) 1))]
    (/ (+ first last) 2)))

(defn approx-average?
  [hand]
  (let [actual-average (card-average hand)
        median-value (median hand)
        first-and-last-avg-value (first-and-last-avg hand)]
    (if (== actual-average median-value) true
        (if (== first-and-last-avg-value actual-average) true false))))