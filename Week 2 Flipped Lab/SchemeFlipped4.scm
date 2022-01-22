; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/7/2020
; Class: CSCE_314
; Lab: Week 2 Question 4

(define (fifteen-percent total)
  (display "15% of ")
  (display total)
  (display " is ")
  (* total .15)
)

(define (main)
  (display (fifteen-percent 120))
  (newline)
  (display (fifteen-percent 20.22))
  (exit)
)

(main)


