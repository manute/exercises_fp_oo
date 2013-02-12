(ns exercises_fp_oo.chapter2)

 (def Point 
 	(fn [x y]  
 		{:x x 
 		 :y y 
 		 :__class_symbol__ 'Point }	
 	) 
 )

 (def class_of :__class_symbol__)

 (def make 
 	(fn [object & args]		
 		(apply object args)
 	)
 )

 (def Triangle 
 	(fn [point1 point2 point3]  
 		{:point1 point1 
 		 :point2 point2
 		 :point3 point3
 		 :__class_symbol__ 'Triangle }	
 	) 
 )


