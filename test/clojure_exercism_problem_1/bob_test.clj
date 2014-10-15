(ns clojure_exercism_problem_1.bob-test 
  (:require [clojure.test :refer :all]
            [clojure_exercism_problem_1.bob :refer :all]))

(deftest responds-to-something
  (is (= "Whatever." (clojure_exercism_problem_1.bob/response-for "Tom-ay-to, tom-aaaah-to."))))

(deftest responds-to-shouts
  (is (= "Whoa, chill out!" (clojure_exercism_problem_1.bob/response-for "WATCH OUT!"))))

(deftest responds-to-questions
  (is (= "Sure." (clojure_exercism_problem_1.bob/response-for "Does this cryogenic chamber make me look fat?"))))

(deftest responds-to-forceful-talking
  (is (= "Whatever." (clojure_exercism_problem_1.bob/response-for "Let's go make out behind the gym!"))))

(deftest responds-to-acronyms
  (is (= "Whatever." (clojure_exercism_problem_1.bob/response-for "It's OK if you don't want to go to the DMV."))))

(deftest responds-to-forceful-questions
  (is (= "Whoa, chill out!" (clojure_exercism_problem_1.bob/response-for "WHAT THE HELL WERE YOU THINKING?"))))

(deftest responds-to-shouting-with-special-characters
  (is (= "Whoa, chill out!" (clojure_exercism_problem_1.bob/response-for "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!"))))

(deftest responds-to-shouting-numbers
  (is (= "Whoa, chill out!" (clojure_exercism_problem_1.bob/response-for "1, 2, 3 GO!"))))

(deftest responds-to-shouting-with-no-exclamation-mark
  (is (= "Whoa, chill out!" (clojure_exercism_problem_1.bob/response-for "I HATE YOU"))))

(deftest responds-to-statement-containing-question-mark
  (is (= "Whatever." (clojure_exercism_problem_1.bob/response-for "Ending with ? means a question."))))

(deftest responds-to-silence
  (is (= "Fine. Be that way!" (clojure_exercism_problem_1.bob/response-for ""))))

(deftest responds-to-prolonged-silence
  (is (= "Fine. Be that way!" (clojure_exercism_problem_1.bob/response-for "    "))))

(deftest responds-to-only-numbers
  (is (= "Whatever." (clojure_exercism_problem_1.bob/response-for "1, 2, 3"))))

(deftest responds-to-number-question
  (is (= "Sure." (clojure_exercism_problem_1.bob/response-for "4?"))))

(run-tests)
