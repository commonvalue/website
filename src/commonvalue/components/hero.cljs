(ns commonvalue.components.hero
  (:require-macros [cljss.core])
  (:require [cljss.core :refer [defstyles]]))

(defstyles wrapperHero [] 
  {:color "white"})

(defstyles video []
  {:padding "56.25% 0 0 0"
   :position "relative"
   :margin-top "40px"
   :border "4px solid #6733d2"
   :border-radius "6px"
   "iframe" {:position "absolute"
             :top 0
             :left 0
             :width "100%"
             :height "100%"}})

(defstyles hero-title []
  {:color "white"
   :font-family "Gulax"
   :font-size "32px"
   :text-transform "uppercase"
   :letter-spacing "1px"
   :text-align "center"})

(defstyles hero-description []
  {:color "white"
   :width "460px"
   :margin "0 auto"
   :text-align "center"
   :font-size "16px"
   :font-family "Haas"
   :letter-spacing "1px"})

(defn hero [] 
  [:div {:class (wrapperHero)}
   [:h3 {:class (hero-title)} "commonvalue"]
   [:h5 {:class (hero-description)} 
    "Make it easy to design the value attribution and distribution for organizations and groups"
    ]
   [:div {:class (video)}
    [:iframe {:src "https://player.vimeo.com/video/333160410" :frameborder "0" :allowfullscreen true}]]
   ])