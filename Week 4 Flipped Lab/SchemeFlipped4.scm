#lang racket
;Name: Ryan Russell
;Partner's Name: Saqib Domki
;Email: rhrussell@tamu.edu
;Course: CSCE 314
;Date: 6/21/20
;Lab: Week 4 Question 4

(define (clone a n)
  (define lst '())
  (if (= n 0)
      lst
      (cons a (clone a (- n 1)))
  )   
)

(define (replicate lst n)
  (cond
    ((null? lst) '())
    (else (append (clone (car lst) n) (replicate (cdr lst) n)))
  )
)

(define (main)
  (display (replicate '(1 2 3) 2))
  (newline)
  (display (replicate '("A" 1 "B" 2) 3))
)

(main)