(ns ex01-say-hello.core
  (:gen-class))

(require '[commons.core :as commons])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def n (commons/prompt "What is your name? "))
    (println (str "Hello, " n ", nice to meet you!")))
