#lang racket
;Name: Ryan Russell
;Partner's Name: Saqib Domki
;Email: rhrussell@tamu.edu
;Course: CSCE 314
;Date: 6/21/20
;Lab: Week 4 Question 2

(define (trafficLight color)
  (cond
    ((eqv? "green" color) (display "It's green\n"))
    ((eqv? "yellow" color) (display "It's yellow!\n"))
    ((eqv? "red" color) (display "stop\n"))
    (else (display "wrong color\n"))
  )
)

(define (main)
  (trafficLight "blue")
  (trafficLight "green")
)

(main)

