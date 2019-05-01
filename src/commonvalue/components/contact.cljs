(ns commonvalue.components.contact
  (:require-macros [cljss.core])
  (:require [cljss.core :refer [defstyles]]))

(defstyles wrapper []
  {:margin-top "40px"})
(defstyles title []
  {:font-family "Gulax"
   :font-size "32px"
   :text-transform "uppercase"
   :position "relative"
   :margin-bottom 0
   :&:after {:position "absolute"
             :content ""
             :right 0
             :height "3px"
             :left "210px"
             :top "15px"
             :background "#723BE2"
             :display "block"}})
(defstyles description []
  {:margin "0"
   :text-transform "capitalize"
   :font-size "15px"
   :margin-top "16px"
   :font-family "Haas"
   :font-weight "700"
   :letter-spacing "0.5px"
   "a" {
        :text-decoration "underline"}})


(defn contact []
  [:div#contact {:class (wrapper)}
   [:h3 {:class (title)} "Contact us"]
   [:h5 {:class (description)}
    "Say hello at commonvalue [@] protonmail.com" [:br]
    "Follow us on twitter " [:a {:href "https://twitter.com/commonvalueapp" :target "_blank"}" @commonvalueapp"] [:br]
    "Contribute to development on github " [:a {:href "https://github.com/commonvalue" :target "_blank"} " @commonvalue"]]])