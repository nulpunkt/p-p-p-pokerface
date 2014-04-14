(ns p-p-p-pokerface)

(defn rank [[rank, _]]
  (let [replacements {\T 10, \J 11, \Q 12, \K 13, \A 14}
        rank-replaced (replacements rank)]
  (if (nil? rank-replaced) (Integer/valueOf (str rank)) rank-replaced)))

(defn suit [[_, s]]
  (str s))

(defn rank-frequencies [hand]
  (let [ranks (map rank hand)]
  (frequencies ranks)))

(defn max-many-of-any-kind [hand]
  (apply max (vals (rank-frequencies hand))))

(defn pair? [hand]
  (> (max-many-of-any-kind hand) 1))

(defn three-of-a-kind? [hand]
  (> (max-many-of-any-kind hand) 2))

(defn four-of-a-kind? [hand]
  (> (max-many-of-any-kind hand) 3))

(defn flush? [hand]
  (apply = (map suit hand)))

(defn full-house? [hand]
  (= (set [3 2]) (set (vals (rank-frequencies hand)))))

(defn two-pairs? [hand]
  (= [1 2 2] (sort (vals (rank-frequencies hand)))))

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
