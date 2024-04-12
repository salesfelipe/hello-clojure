(ns exercises.exercism-interest-is-interesting)

(defn interest-rate
  "Returns the interest rate based on the specified balance."
  [balance]
  (cond
    (< balance 0) -3.213
    (and (>= balance 0) (< balance 1000)) 0.5
    (and (< balance 5000) (>= balance 1000)) 1.621
    (>= balance 5000) 2.475
    :else "error"))

(defn annual-balance-update
  "Calculate the annual balance update"
  [balance]
  (+ balance
     (* balance
        1/100
        (bigdec (abs (interest-rate balance))))))

(defn amount-to-donate
  "Returns how much money to donate based on the balance and the tax-free percentage."
  [balance tax-free-percentage]
  (let [rate (bigdec (* 2 (/ tax-free-percentage 100)))]
    (if (pos? balance) (int (* rate balance)) 0)))
