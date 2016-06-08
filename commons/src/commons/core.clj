(ns commons.core)

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
