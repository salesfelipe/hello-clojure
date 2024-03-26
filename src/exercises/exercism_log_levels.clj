(ns exercises.exercism-log-levels
  (:require [clojure.string :as str]))

(defn message
  "Takes a string representing a log line
   and returns its message with whitespace trimmed."
  [s]
  (str/trim 
   (str/replace 
    (peek (str/split s #":")) #"[\t\n\r]" "")))

(defn log-level
  "Takes a string representing a log line
   and returns its level in lower-case."
  [s]
  (str/lower-case 
   (peek (re-find #"\[(.*?)\]" s))))

(defn reformat
  "Takes a string representing a log line and formats it
   with the message first and the log level in parentheses."
  [s])
