(ns exercises.exercism-elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck] (let [[first-card] deck] first-card))

(defn second-card
  "Returns the second card from deck."
  [deck] (let [[_ second] deck] second))

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (let [[first second & remaining] deck]
    (if (nil? remaining)
      [second first]
      (cons second (cons first remaining)))))

(defn discard-top-card
  "Returns a sequence containing the first card and
   a sequence of the remaining cards in the deck."
  [deck]
  (let [[top-card & remaining] deck]
    (if (nil? remaining) 
      [top-card remaining] 
      [top-card (into [] remaining)])))

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck])
