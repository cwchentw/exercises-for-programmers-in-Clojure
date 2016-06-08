(defproject ex05-simple_math "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [commons "0.1.0-SNAPSHOT"]]
  :repositories {"local" ~(str (.toURI (java.io.File. "../commons_repo")))}
  :main ^:skip-aot ex05-simple-math.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
