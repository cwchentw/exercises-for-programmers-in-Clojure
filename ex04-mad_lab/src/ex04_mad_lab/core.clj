(ns ex04-mad-lab.core
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
  (def noun (prompt "Enter a noun: "))
  (def verb (prompt "Enter a verb: "))
  (def adj (prompt "Enter an adjective: "))
  (def adv (prompt "Enter an adverb: "))
  (println (str "Do you " verb " your " adj " " noun " " adv
                "? That's hilarious!")))
