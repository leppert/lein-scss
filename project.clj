(defproject lein-scss "0.3.1-SNAPSHOT"
  :description         "A lein plugin to compile scss to css."
  :url                 "https://github.com/bluegray/lein-scss"
  :scm                 {:name "git"
                        :url  "https://github.com/bluegray/lein-scss"}
  :license             {:name "Eclipse Public License"
                        :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :signing             {:gpg-key "D7914BDD"}
  :deploy-repositories [["releases" :clojars {:creds :gpg}
                         {:url      "https://clojars.org/repo"
                          :username [:env/clojars_username :gpg]
                          :password [:env/clojars_password :gpg]}]]
  :eval-in-leiningen   true
  :dependencies        [[org.clojure/clojure "1.7.0"]
                        [juxt/dirwatch "0.2.3"]
                        [clj-time "0.12.0"]])
