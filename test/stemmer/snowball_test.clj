(ns stemmer.snowball-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [stemmer.snowball :refer [stemmer]]))

(deftest test-stemmer
  (testing "English stemmer"
    (let [st (stemmer :english)]
      (is (= (st "loved") (st "love")))
      (is (= (st "fitted") (st "fit")))
      (is (= (st "probably") (st "probable")))))
  (testing "Lithuanian stemmer"
    (let [st (stemmer :lithuanian)]
      (is (= (st "kainuoja") (st "kainuo")))
      (is (= (st "pasiilgau") (st "pasiilg")))
      (is (= (st "vard") (st "vardas"))))))
