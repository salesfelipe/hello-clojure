(ns test.ex-squeaky-clean-test
  (:require [clojure.test :refer :all]
            [exercises.exercism-squeaky-clean :refer
   [clean]]))

(deftest check-inc-bird
  (testing "Remove spaces"
    (is (= "my___Id" (clean "my   Id")))
    (is (= "myCTRLId" (clean "myId")))
  (is (= "myId" (clean "my-id")))
  (is (= "MyFinder" (clean "My😀😀Finder😀")))
    (is (= "MyFinder" (clean "1My2Finder3")))
    (is (= "MyΟFinder" (clean "MyΟβιεγτFinder")))
    (is (= "_AbcĐCTRL" (clean "9 -abcĐ😀ω")))

))
