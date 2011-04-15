(defproject karras "0.4.1"
  :description "A clojure entity framework for MongoDB"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.mongodb/mongo-java-driver "2.3"]
                 [inflections "0.4"]]  
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [lein-clojars "0.5.0"]
                     [autodoc "0.7.1"
                      :exclusions [org.clojure/clojure org.clojure/clojure-contrib]]
                     [scriptjure "0.1.9"
                      :exclusions [org.clojure/clojure org.clojure/clojure-contrib]]
                     [midje "0.2.0"]]
  :aot [karras.core karras.collection karras.sugar karras.entity karras.validations]
  :autodoc {:web-src-dir "http://github.com/wilkes/karras/blob/"
            :web-home "http://wilkes.github.com/karras"})
