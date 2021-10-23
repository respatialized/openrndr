(ns respatialized.openrndr
  (:import [org.openrndr Application Program Configuration]
           [org.openrndr.shape Circle])
  (:gen-class))

(comment
  (.run (Application/Companion) (Program.) (Configuration.))

  )


(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))
