(ns bodol.test
  (:refer-clojure :exclude [test])
  (:require [bodol.repl :as repl]
            [bodol.types :as t]
            [bodol.parser :as parser]
            [bodol.error :as err]))

(defn run []
  (try
    (repl/eval-file "src/bodol/test.bodol")
    (catch clojure.lang.ExceptionInfo e
      (err/report e))))
