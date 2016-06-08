(ns ex02-count-char-number.core
  (:gen-class))

(require 'clojure.string)

(defn prompt
  [msg]
  (print msg)
  (flush)
  (clojure.string/trim-newline (read-line)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def var (prompt "What is the input string? "))
  (println (str var " has " (count var) " characters.")))
