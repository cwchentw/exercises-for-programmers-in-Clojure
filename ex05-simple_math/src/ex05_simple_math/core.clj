(ns ex05-simple-math.core
  (:gen-class))

(require 'clojure.string)

(defn prompt
  [msg]
  (print msg)
  (flush)
  (clojure.string/trim-newline (read-line)))

(defn str2num
  [str]
  (let [n (read-string str)]
    (if (number? n)
      n
      nil)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def a (str2num (prompt "What is the first number? ")))
  (def b (str2num (prompt "What is the second number? ")))
  (println (str a " + " b " = " (+ a b)))
  (println (str a " - " b " = " (- a b)))
  (println (str a " * " b " = " (* a b)))
  (println (str a " / " b " = " (/ a b))))
