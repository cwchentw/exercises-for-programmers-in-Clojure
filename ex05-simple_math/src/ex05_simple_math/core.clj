(ns ex05-simple-math.core
  (:gen-class))

(require '[commons.core :as commons])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def a (commons/str2num (commons/prompt "What is the first number? ")))
  (def b (commons/str2num (commons/prompt "What is the second number? ")))
  (println (str a " + " b " = " (+ a b)))
  (println (str a " - " b " = " (- a b)))
  (println (str a " * " b " = " (* a b)))
  (println (str a " / " b " = " (/ a b))))
