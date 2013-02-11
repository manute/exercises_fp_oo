(ns exercises_fp_oo.chapter1_test
  (:use [exercises_fp_oo.chapter1])
  (:use [midje.sweet]))

(fact "factorial of 5 is 120" 
	(factorial 5) => 120 
)
(fact "square elements passed by arguments" 
	(square 1 2 3) => [1 4 9]
)