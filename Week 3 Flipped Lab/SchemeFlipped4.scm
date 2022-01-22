; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/14/20
; Lab: Week 3 Question 4

(define (remove-item atm lst)
  (cond
      [(null? lst) '()]
      [(equal? atm (car lst)) (cdr lst)]
      (else (cons (car lst) (remove-item atm (cdr lst)))))
)

(define (main)
  (display (remove-item 3 '(1 2 3 4 5)))
  (newline)
  (display (remove-item '(B C) '(A (B C) D)))
)

(main)
(exit)
