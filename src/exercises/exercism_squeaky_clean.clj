(ns exercises.exercism-squeaky-clean
  (:require [clojure.string :as str]))

(defn remove-spaces
  [s]
  (str/replace s #"\s" "_"))

(defn replace-ctrl
  [s]
  (str/replace s "" "CTRL"))

(defn replace-special-char
  [s]
  (str/replace s #"[^a-zA-Z_\-àḃçḂΟ]+" ""))

(defn remove-greek-letters [s]
  (str/replace s #"[α-ω]" ""))

(defn convert-to-camel-case
  [s]
  (let [first-l (subs s 0 1)
       lowered-l (str/lower-case first-l)
       capitalized (str/join "" (map str/capitalize (str/split s #"-")))]
   (if (str/includes? s "-") 
     (str/replace capitalized (subs capitalized 0 1) lowered-l) 
     s)))

(defn clean 
  [s]
  (-> s
     remove-spaces
     replace-ctrl
     replace-special-char
     remove-greek-letters
     convert-to-camel-case))

