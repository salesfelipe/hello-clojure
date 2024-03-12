(ns test.core
  (:gen-class))

(defn main
   "I don't do a whole lot ... yet."
   [args]
   (if (= args 1) 
     (println "printou true") 
     (println "printou false")))

(main 1 2)