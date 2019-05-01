(ns commonvalue.core
  (:require-macros [cljss.core])
  (:require [reagent.core :as r]
            [cljss.core :refer [defstyles]]
            [cljss.core :refer [font-face inject-global]]
            [commonvalue.components.header :refer [header]]
            [commonvalue.components.hero :refer [hero]]
            [commonvalue.components.how :refer [how]]
            [commonvalue.components.contact :refer [contact]]
            [commonvalue.components.why :refer [why]]))


(def v-margin 4)
;; design system
(def colors
  {:blue   "#298FCA"
   :green  "#7BC86C"
   :orange "#FFB968"
   :red    "#EF7564"
   :yellow "#F5DD29"})

(def fonts
  {:primary "../fonts/gulax-webfont.woff"
   :secondary "../fonts/haas.woff"})

(font-face
  {:font-family "Gulax"
   :font-style "normal"
   :font-weight 400
   :src [{:url (str (fonts :primary))}]})

(font-face
 {:font-family "Haas"
  :font-style "normal"
  :font-weight 400
  :src [{:url (str (fonts :secondary))}]})

(inject-global
 {:body     {:background "#7F42FB"
             :color "#fff"
             :font-family "Haas"}
  :ul       {:list-style "none"}
  "ul > li" {:margin (str v-margin "px 0")}})

(defstyles wrapper []
  {:width "680px"
   :margin "0 auto"
   :color "white"
   "a" {:color "white"
        :text-decoration "none"
        :font-size "15px"
        :letter-spacing "1px"
        :font-weight "600"}})

(defn app []
  [:div {:class (wrapper)}
   [header]
   [hero]
   [why]
   [how]
   [contact]
   ])

(defn start []
  (r/render-component [app]
                            (. js/document (getElementById "app"))))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (start))

(defn stop []
  ;; stop is called before any code is reloaded
  ;; this is controlled by :before-load in the config
  (js/console.log "stop"))
