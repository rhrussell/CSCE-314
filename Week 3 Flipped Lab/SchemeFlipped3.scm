; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/14/20
; Course: CSCE_314
; Lab: Week 3 Question 3

(define (member atm lst)
  (cond
    [(null? lst) #f]
    [(eq? atm (car lst)) #t]
    (else (member atm (cdr lst))))
)

(define (union lst1 lst2)
  (cond
   [(null? lst2) lst1]
   [(null? lst1) lst2]
   [(member (car lst2) lst1) (union lst1 (cdr lst2))]
   (else (union (cons (car lst2) lst1) (cdr lst2))))
)

(define (main)
  (display (union '(1 2 3 4) '(4 -1 2 5)))
  (newline)
  (display (union '(1 2 3) '()))
)

(main)
(exit)
