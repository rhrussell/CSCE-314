; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/14/20
; Lab: Week 3 Question 5

(define (reverse lst)
  (if (null? lst)
      '()
      (append (reverse (cdr lst)) (list (car lst))))
)

(define (listmaker n)
  (if (<= n 0)
      '()
      (cons (- n 1) (listmaker (- n 1))))
)

(define (main)
  (display (reverse (listmaker 5)))
)

(main)
(exit)
