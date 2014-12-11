(ns smoker-cljs.index)

(defn index [req res] 
  (.send res "Hello World!"))

(defn test [req res]
  (.send res "test"))

(defn main [app]
  (-> app 
      (.get "/" index)
      (.get "/test" test)))

(set! js/exports smoker-cljs.index)