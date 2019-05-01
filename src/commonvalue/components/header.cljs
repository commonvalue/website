(ns commonvalue.components.header
  (:require-macros [cljss.core]
                   [cljss.reagent])
  (:require [cljss.core :refer [defstyles]]
            [cljss.reagent :refer [defstyled]]))


(defstyles logo [] 
  {:border "1px solid white"
   :height "40px"
   :width "40px"
   :border-radius "3px"
   :font-family "Gulax"
   :font-size "20px"
   :margin 0
   :padding 0
   :line-height "44px"
   :text-align "center"
   :vertical-align "middle"
   :display "inline-block"
   :box-sizing "border-box"
   })

(defn header
  []
  [:div 
   [:div.center
    [:menu.nav
     [:h5.nav-logo {:class (logo)} "O"]
     [:a.nav-item {:href "#why"} "why?"]
     [:a.nav-item {:href "#how"} "how it works"]
     [:a.nav-item {:href "#contact"} "contact us"]]]])
