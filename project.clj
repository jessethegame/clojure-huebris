(defproject huebris "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.6.0"]
    [org.clojure/clojure-contrib "1.2.0"]
    [environ "0.5.0"]
    [clj-time "0.9.0"]
    [clj-http "1.0.1"]
    [overtone/at-at "1.2.0"]]
  :main ^:skip-aot huebris.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
