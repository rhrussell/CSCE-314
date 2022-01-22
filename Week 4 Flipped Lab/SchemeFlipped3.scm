#lang racket
;Name: Ryan Russell
;Partner's Name: Saqib Domki
;Email: rhrussell@tamu.edu
;Course: CSCE 314
;Date: 6/21/20
;Lab: Week 4 Question 3

(define (clone a n)
  (define lst '())
  (if (= n 0)
      lst
      (cons a (clone a (- n 1)))
  )   
)

(define (main)
  (display (clone 3 7))
  (newline)
  (display (clone 'A' 4))
)

(main)