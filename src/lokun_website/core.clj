(ns lokun-website.core
  (:use [hiccup.core])
  (:use [hiccup.element])
  (:use [hiccup.page]))

(defn -main
  "Main function"
  [& args]
  (let [webpage (generate-html)]
    (spit "www/index.html" webpage)))

(defn generat-html []
  (print "test"))

(defn generate-html
  "Generate static html for lokun.is"
  []
  (hiccup.page/html4
   [:head
    (include-css "style.css")
    [:meta {:http-equiv "Content-Type" :content "text/html; charset=utf-8"}]
    [:title "(lokun).is - Utanlandsbandvídd fyrir almenning"]]
   [:body
    [:div#title [:h1 "(lokun).is"]]
    [:h2 "Utanlandsbandvídd fyrir almenning"]
    [:p "Núna á næstu dögum mun (lokun) fara í loftið. Við munum selja áskrift fyrir 2000 krónur á mánuði en með henni geturu halað niður allt að 1 TB af gögnum erlendis frá!"]
    [:h2 "Hvernig virkar þetta?"]
    [:p "Við kaupum gagnamagn ódýrt í íslensku gagnaveri. Þú setur upp lítið svaka einfalt forrit sem keyrir í bakgrunni á þínum tölvum (hægir ekki á þeim, ekkert vesen). Þetta forrit beinir erlendri traffík í gegnum okkur á leið sinni til útlanda og þar af leiðandi reiknast hún ekki sem partur af erlendu gagnamagni á netreikningnum þínum. Svo einfalt er það."]
    [:h2 "Þarf ég að nota þetta forrit ykkar? Hvað ef ég keyri ekki Windows?"]
    [:p "Þjónustan okkar virkar líka fullkomlega með OpenVPN, sem er opinn hugbúnaður og keyrir á Windows, Linux, OS X, Android og guð má vita hverju fleiru. Athugaðu að þetta krefst mun erfiðari uppsetningar og mun senda íslenska traffík í gegnum okkur líka nema þú grípir til flókinna aðgerða."]
    [:h2 "Ætlið þið að stórgræða á þessu?"]
    [:p "Lítur það út fyrir það með þetta verð? Við fórum eins nálægt kostnaðarverði og við þorum og vonum að þetta standi undir sér. Við erum báðir forritarar með ágætis tekjur og erum svo sannarlega ekki að stofna þetta með vonir um lúxusjeppa og hádegisbrunch á Hilton."]
    [:h2 "Hverjir eruð þið?"]
    [:p "Benedikt Kristinsson - benedikt hjá lokun púnktur is"]
    [:p "Karl Emil Karlsson - kalli hjá lokun púnktur is"]
    [:h2 "Hvernig hef ég samband?"]
    [:p "lokun hjá lokun púnktur is"]
    [:h2 "Hvaðan kemur nafnið (lokun)?"]
    [:p "Lokun er íslensk þýðing á enska orðinu \"closure\" en við erum mjög hrifnir af lokunum í almennum kóðaskrifum."]
    [:h2 "Unnuð þið Startup Weekend Reykjavík?"]
    [:p "Já! " (link-to "http://www.mbl.is/frettir/innlent/2013/03/17/natturulegir_sterar_og_nudd/" "Sjá hér!")]]))