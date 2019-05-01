(ns commonvalue.components.why
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
   :&:after {
             :position "absolute"
             :content ""
             :right 0
             :height "3px"
             :left "90px"
             :top "15px"
             :background "#723BE2"
             :display "block"}})
(defstyles description []
  {:margin "0"
   :text-transform "uppercase"
   :font-size "15px"
   :margin-top "16px"
   :font-family "Haas"
   :font-weight "700"
   :letter-spacing "0.5px"})
(defstyles card []
  {:background "#723BE2"
   :border-radius "8px"
   :padding "16px"
   :margin-top "24px"})
(defstyles text []
  {:font-family "Haas"
   :font-weight "700"
   :letter-spacing "0.5px"
   :font-size "15px"
   :margin-bottom "0"})
(defstyles icon []
  {:text-align "center"
   "img" {:width "40px"
          :text-align "center"}})

(defn why []
  [:div#why {:class (wrapper)}
   [:h3 {:class (title)} "Why"]
   [:h5 {:class (description)} "PRIVATE ORGANIZATIONS, COMMUNITIES AND PUBLIC INSTITUTIONS ARE CHANGHING"]
   [:div.row
    [:div.col
     [:div {:class (card)}
      [:div {:class (icon)}
       [:img {:src "../images/hand.png"}]]
      [:p {:class (text)} "Participants engagement is becoming a central topic"]]]
    [:div.col
     [:div {:class (card)}
      [:div {:class (icon)}
       [:img {:src "../images/explode.png"}]]
      [:p {:class (text)} "Corporate or bottom-up welfare systems are juxtaposing welfare state"]]]]
   [:h4 "Nevertheless there are few tools capable to support these transformations. In order to give an impacting advance in engagement processes, We want to help to:"]
   [:div.row
    [:div.col
     [:div {:class (card)}
      [:div {:class (icon)}
       [:img {:src "../images/bchain.png"}]]
      [:p {:class (text)} "Give transparency to participation processes  through blockchain technology"]]]
    [:div.col
     [:div {:class (card)}
      [:div {:class (icon)}
       [:img {:src "../images/100.png"}]]
      [:p {:class (text)} "Support decision making about value attribution and distribution"]]]]
   ]
   )