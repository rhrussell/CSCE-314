; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/14/20
; Course: CSCE_314
; Lab: Week 3 Question 2

(define (min-list-value lst)
  (cond 
      [(null? lst) '()]
      [(null? (cdr lst)) (car lst)]
      [(< (car lst) (min-list-value lst)) (car lst)]
      (else (min-list-value (cdr lst))))
)

(define (max-list-value lst)
  (cond
      [(null? lst) '()]
      [(null? (cdr lst)) (car lst)]
      [(> (car lst) (max-list-value lst)) (car lst)]
      (else (max-list-value (cdr lst))))
)

(define (main)
  ;(display (min-list-value '(3 2 1 2 3)))
  ;(newline)
  ;(display (max-list-value '(1 2 3 2 1)))
  (display (min-list-value '(1 2)))
)

(main)
(exit)
