(ns ex06-retirement-calculator.core
  (:gen-class))

(require '[clj-time.core :as time])
(require '[commons.core :as commons])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [age
        (commons/str2num
         (commons/prompt "What is your current age? "))
        retirement
        (commons/str2num
         (commons/prompt "At what age would you like to retire? "))
        year (time/year (time/now))]
    (println (str "You have " (- retirement age) " years left until "
                  "you can retire"))
    (println (str "It's " year ", so you can retire in  "
                  (+ year (- retirement age))))
    ))
