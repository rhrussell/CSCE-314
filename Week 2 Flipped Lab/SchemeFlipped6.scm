; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/7/2020
; Class: CSCE_314
; Lab: Week 2 Question 6

(define (letterGrade value)
  (cond
        [(>= value 90) "A"]
	[(and(>= value 80)(< value 90)) "B"]
	[(and(>= value 70)(< value 80)) "C"]
	[(and(>= value 60)(< value 70)) "D"]
	[(< value 60) "F"])
)

(define (main)
  (display "89 is a ")
  (display (letterGrade 89))
  (newline)
  (display "55 is a ")
  (display (letterGrade 55))
  (exit)
)

(main)
