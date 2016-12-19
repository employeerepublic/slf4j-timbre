(defproject employeerepublic/slf4j-timbre "0.4.2"
  :description "SLF4J binding for Timbre"
  :url "https://github.com/employeerepublic/slf4j-timbre"
  :scm {:name "git"
        :url "https://github.com/employeerepublic/slf4j-timbre"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.reader "1.0.0-beta3"]
                 [com.taoensso/timbre "4.7.4"
                  :exclusions [org.clojure/tools.reader]]
                 [org.slf4j/slf4j-api "1.7.21"]]
  :profiles {:dev
             {:dependencies [[midje "1.8.3"]]
              :plugins [[lein-midje "3.2.1"]]}}
  :aot :all)
