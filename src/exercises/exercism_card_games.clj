(ns exercises.exercism-card-games)
(require '[clojure.math :refer [floor]])

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


(defn- is-last-jack?
  "If the last card is a Jack (11)"
  [hand]
  (= 11 (nth hand (- (count hand) 1))))

(defn maybe-double-last
  "If the last card is a Jack (11), doubles its value
   before returning the hand."
  [hand]
 (let [should-double (is-last-jack? hand)]
   (if should-double (concat (drop-last hand) [22]) hand)))

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