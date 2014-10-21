(ns clojure_exercism_problem_1.bob
  (:gen-class))

(require '[clojure.string :as str])

(def RESPONSE_QUESTION "Sure.")
(def RESPONSE_YELL     "Whoa, chill out!")
(def RESPONSE_SILENCE  "Fine. Be that way!")
(def RESPONSE_OTHER    "Whatever.")

; Any empty string counts as silence (prolonged or otherwise)
(defn isSilence [input]
  (str/blank? input))

; Anything that ends with a question mark is a question
(defn isQuestion [input]
  (.endsWith input "?"))

; Returns the input string with nothing but alphabetic characters in it
(defn makeJustAlpha [s]
  (.replaceAll s "[^a-zA-Z]" ""))

; Yelling is where all alphanumeric characters are upper case
(defn isYell [input]
  (let [just-alpha (makeJustAlpha input)
        upper-comp (str/upper-case just-alpha)]
     (and 
        (= just-alpha upper-comp)
        (not (str/blank? just-alpha)))))

(defn response-for [input]
  (cond
    (isYell     input) RESPONSE_YELL
    (isQuestion input) RESPONSE_QUESTION
    (isSilence  input) RESPONSE_SILENCE
    :else RESPONSE_OTHER))



