(ns p-p-p-pokerface)

(defn rank [[rank, _]]
  (let [replacements {\T 10, \J 11, \Q 12, \K 13, \A 14}
        rank-replaced (replacements rank)]
  (if (nil? rank-replaced) (Integer/valueOf (str rank)) rank-replaced)))

(defn suit [[_, s]]
  (str s))

(defn pair? [hand]
  nil)

(defn three-of-a-kind? [hand]
  nil)

(defn four-of-a-kind? [hand]
  nil)

(defn flush? [hand]
  nil)

(defn full-house? [hand]
  nil)

(defn two-pairs? [hand]
  nil)

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
