(ns exercises_fp_oo.chapter2_test
  (:use [exercises_fp_oo.chapter2])
  (:use [midje.sweet]))

(fact "create data like object call Point" 
	(class_of (Point 2 1)) => 'Point
	(:x (Point 2 1)) => 2
	(:y (Point 2 1)) => 1
)

(fact "make a object Point"
	(:x (make Point 1 2) ) => 1
	(class_of (make Point 1 2)) => 'Point
)
(fact "make a object Triangle (three Points)"
	( class_of (make Triangle (make Point 1 2)
                    (make Point 1 3)
                    (make Point 3 1))) => 'Triangle

)	
