(ns ex02-count-char-number.core
  (:gen-class))

(require '[commons.core :as commons])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def var (commons/prompt "What is the input string? "))
  (println (str var " has " (count var) " characters.")))
