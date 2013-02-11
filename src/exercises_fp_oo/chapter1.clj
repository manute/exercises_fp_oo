(ns exercises_fp_oo.chapter1)

 (def square 
 	(fn [ & numbers]  
 		(map * numbers numbers)
 	) 
 )

 (def factorial 
 	(fn[number]  
 		(apply * (cons 5 (range 1 5 ) ) ) 
 	) 
 ) 

