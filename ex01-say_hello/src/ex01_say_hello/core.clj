(ns ex01-say-hello.core
  (:gen-class))

(require '(clojure.string))

(defn prompt
  [msg]
  (print msg)
  (flush)
  (clojure.string/trim-newline (read-line)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def n (prompt "What is your name? "))
    (println (str "Hello, " n ", nice to meet you!")))
