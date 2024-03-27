(ns exercises.exercism-bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(defn today [birds] (peek birds))

(defn inc-bird [birds]
  (let [today-index (- (count birds) 1)
        today-value (get birds today-index)]
    (assoc birds today-index (inc today-value))))

(defn day-without-birds?
  [birds]
  (not (= (.indexOf birds 0) -1)))

(defn n-days-count
  [birds n]
  (let [indexes (range n)]
    (reduce 
     (fn [acc i] (+ acc (get birds i))) 0 indexes)))

(defn busy-days [birds]
  (reduce 
   (fn [acc value] 
     (if (> value 4 ) (+ acc 1) acc)) 0 birds))

(defn odd-week? 
  [birds]
  (let [odd-pattern [1 0 1 0 1 0 1]]
    (= birds odd-pattern)))


