(ns smoker-cljs.core
  (:require [cljs.nodejs :as nodejs]
            [smoker-cljs.index :as index]))

(nodejs/enable-util-print!)

(def express (js/require "express"))
(def app (express))

(index/main app)

(defn -main []
  (let [server (.listen app 3000)
        port (-> server 
                 (.address) 
                 (.-port))]
    (println (str "Listening " port))))

(set! *main-cli-fn* -main)
