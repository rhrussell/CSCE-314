#lang racket
;Name: Ryan Russell
;Partner's Name: Saqib Domki
;Email: rhrussell@tamu.edu
;Course: CSCE 314
;Date: 6/21/20
;Lab: Week 4 Question 1

(define (remove-item atom lst)
  (cond
    ((null? lst) '())
    ((list? (car lst)) (cons (remove-item atom (car lst)) (remove-item atom (cdr lst))))
    ((eqv? atom (car lst)) (remove-item atom (cdr lst)))
    (else (cons (car lst) (remove-item atom (cdr lst))))
  )
)

(define (main)
  (display (remove-item 1 (cons '(1 1 '(1 1 '(1))) '(1 2 '(1 3)))))
)

(main)