(ns test.ex-log-levels-test
  (:require [clojure.test :refer :all]
            [exercises.exercism-log-levels :refer
             [message]]))

(deftest check-message
  (is (= "Invalid operation" (message "[ERROR]: Invalid operation")))
  (is (= "Disk almost full" (message "[WARNING]:  Disk almost full\r\n")))
  (is (= "Timezone not set" (message "[WARNING]:   \tTimezone not set  \r\n"))))