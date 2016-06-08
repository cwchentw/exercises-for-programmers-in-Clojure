(ns ex04-mad-lab.core
  (:gen-class))

(require '[commons.core :as commons])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def noun (commons/prompt "Enter a noun: "))
  (def verb (commons/prompt "Enter a verb: "))
  (def adj (commons/prompt "Enter an adjective: "))
  (def adv (commons/prompt "Enter an adverb: "))
  (println (str "Do you " verb " your " adj " " noun " " adv
                "? That's hilarious!")))
