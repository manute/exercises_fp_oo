(ns exercises_fp_oo.chapter2_test
  (:use [exercises_fp_oo.chapter2])
  (:use [midje.sweet]))

(fact "create data like object call Point" 
	(class_of (Point 2 1)) => 'Point
	(:x (Point 2 1)) => 2
	(:y (Point 2 1)) => 1
)
