(ns clojure_exercism_problem_1.bob
  (:gen-class))

;(require '[clojure.string :as str])
(import 'org.apache.commons.lang3.StringUtils)

(def RESPONSE_QUESTION "Sure.")
(def RESPONSE_YELL     "Whoa, chill out!")
(def RESPONSE_SILENCE  "Fine. Be that way!")
(def RESPONSE_OTHER    "Whatever.")

(defn isSilence [input]
  (StringUtils/isBlank input))

(defn isQuestion [input]
  (.endsWith input "?"))

(defn isYell [input]
  (StringUtils/isAllUpperCase (.replaceAll input "\\d" "")))

(defn response-for [input]
  (cond
    (isQuestion input) RESPONSE_QUESTION
    (isYell     input) RESPONSE_YELL
    (isSilence  input) RESPONSE_SILENCE
    :else RESPONSE_OTHER))



