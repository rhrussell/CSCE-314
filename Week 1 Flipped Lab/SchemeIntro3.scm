 ; Name: Ryan Russell
; Partner Name: Saqib Domki
; Assignment: Lab1 - SchemeIntro3
; Date: 5/29/2020

(define n  0)
(display "Enter a positive number\n")
(set! n (read))
(define (fib n) (if (< n 2) n (+ (fib (- n 1)) (fib (- n 2)))))
(trace fib)
(fib n)
(exit)
