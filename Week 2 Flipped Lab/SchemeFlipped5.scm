; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/7/2020
; Class: CSCE_314
; Lab: Week 2 Question 5

(define (is-positive value)
 (if (>= value 0) 
     #t
     #f)
)

(define (main)
  (display (is-positive -21))
  (newline)
  (display (is-positive 22))
  (exit)
)

(main)
