(ns commonvalue.components.how
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
   :padding "36px"
   :margin-top "24px"})
(defstyles text []
  {:font-family "Haas"
   :font-weight "700"
   :letter-spacing "0.5px"
   :font-size "15px"
   :text-align "center"
   :margin-bottom "0"})
(defstyles icon []
  {:text-align "center"
   "img" {:width "40px"
          :text-align "center"}})
(defstyles banner []
  {:background "#381A74"
   :border-radius "6px"
   :padding "0 16px"
   :line-height "60px"
   :margin-top "24px"
   :font-weight "800"
   :text-align "center" 
   "a" {:text-decoration "underline"
        }})

(defn how []
  [:div#how {:class (wrapper)}
   [:h3 {:class (title)} "How"]
   [:h5 {:class (description)} "COMMONVALUE HELPS FORMAL OR INFORMAL GROUPS OF PEOPLE WHO COLLABORATE, TO DESIGN ITS OWN RECIPE REPRESENTING ITS GOVERNANCE"]
   [:div.row
    [:div.col
     [:div {:class (card)}
      [:div {:class (icon)}
       [:img {:src "../images/all.png"}]]]
     [:p {:class (text)} "Identify your ecosystem structure"]]
    [:div.col
     [:div {:class (card)}
      [:div {:class (icon)}
       [:img {:src "../images/defn.png"}]]]
     [:p {:class (text)} "Design your value equation"]]
    [:div.col
     [:div {:class (card)}
      [:div {:class (icon)}
       [:img {:src "../images/dist.png"}]]]
     [:p {:class (text)} "Automatize the distribution"]]
    ]
   [:div {:class (banner)}
    "Do you want to know more? " [:a {:href "./deck.pdf" :target "_blank"} " Have a look at our latest slide deck"]
    ]
   ])