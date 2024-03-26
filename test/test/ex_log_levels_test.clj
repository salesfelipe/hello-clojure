(ns test.ex-log-levels-test
  (:require [clojure.test :refer :all]
            [exercises.exercism-log-levels :refer
             [message log-level reformat]]))

(deftest check-message
  (is (= "Invalid operation" (message "[ERROR]: Invalid operation")))
  (is (= "Disk almost full" (message "[WARNING]:  Disk almost full\r\n")))
  (is (= "Timezone not set" (message "[WARNING]:   \tTimezone not set  \r\n"))))

(deftest check-log-level
  (is (= "error" (log-level "[ERROR]: Invalid operation")))
  (is (= "warning" (log-level "[WARNING]:  Disk almost full\r\n")))
  (is (= "info" (log-level "[INFO]:   \tTimezone not set  \r\n"))))

(deftest check-reformat
  (is (= "Invalid operation (error)" (reformat "[ERROR]: Invalid operation")))
  (is (= "Disk almost full (warning)" (reformat "[WARNING]:  Disk almost full\r\n")))
  (is (= "Timezone not set (info)" (reformat "[INFO]:   \tTimezone not set  \r\n"))))