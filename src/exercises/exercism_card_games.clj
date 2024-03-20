(ns exercises.exercism-card-games)

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


(defn average-even-odd?
  "Returns true if the average of the cards at even indexes 
   is the same as the average of the cards at odd indexes."
  [hand])

(defn maybe-double-last
  "If the last card is a Jack (11), doubles its value
   before returning the hand."
  [hand])

