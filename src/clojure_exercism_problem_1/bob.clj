(ns clojure_exercism_problem_1.bob
  (:gen-class))

(import 'org.apache.commons.lang3.StringUtils)

(def RESPONSE_QUESTION "Sure.")
(def RESPONSE_YELL     "Whoa, chill out!")
(def RESPONSE_SILENCE  "Fine. Be that way!")
(def RESPONSE_OTHER    "Whatever.")

; Any empty string counts as silence (prolonged or otherwise)
(defn isSilence [input]
  (StringUtils/isBlank input))

; Anything that ends with a question mark is a question
(defn isQuestion [input]
  (.endsWith input "?"))

; Yelling is where all alphanumeric characters are upper case
(defn isYell [input]
  (StringUtils/isAllUpperCase (.replaceAll input "[^a-zA-Z]" "")))

(defn response-for [input]
  (cond
    (isYell     input) RESPONSE_YELL
    (isQuestion input) RESPONSE_QUESTION
    (isSilence  input) RESPONSE_SILENCE
    :else RESPONSE_OTHER))



