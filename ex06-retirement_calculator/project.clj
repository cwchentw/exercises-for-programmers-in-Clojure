(defproject ex06-retirement_calculator "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-time "0.12.0"]
                 [commons "0.1.0-SNAPSHOT"]]
  :repositories {"local" ~(str (.toURI (java.io.File. "../commons_repo")))}
  :main ^:skip-aot ex06-retirement-calculator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
