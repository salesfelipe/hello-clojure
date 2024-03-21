(ns exercises.imc)

;; DESAFIO IMC = (peso / (altura * altura))
;; baixo = peso < 18,5
;; ideal = 18,5 <= peso <= 24,9
;; acima = 24,9 > peso

(defn- calcula-imc
  [altura peso]
  (/ peso (* altura altura)))

(defn confere-imc
  [altura peso]
  (let [imc (calcula-imc altura peso)]
    (if (< imc 18.5) 
      :baixo
        (if (> imc 24.9) 
          :alto
            :ideal))))