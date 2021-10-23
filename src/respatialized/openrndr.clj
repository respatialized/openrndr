(ns respatialized.openrndr
  (:import [org.openrndr Application Program Configuration]
           [org.openrndr.shape Circle]
           [org.openrndr.color ColorHSVa ColorRGBa ])
  (:gen-class))

(def config
  (doto (Configuration. )
    (.setTitle "RESPATIALIZED // openrndr")
    (.setWidth 900)
    (.setHeight 900)
    ))

(def color
  (ColorHSVa/Companion))


(comment
  (ColorHSVa. 100.0 100.0 100.0 100.0))

(def program
  (doto (Program. )
    (.setBackgroundColor
     (.toRGBa (ColorHSVa. 1.0 0.7 0.5 100.0))
     )))

(defn launch [] (.run (Application/Companion) program config))

(def app
  (doto
      (Thread. launch)
      (.setDaemon true)
      (.start)))

(comment

  (.stop app)


  )

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))
