; Name: Ryan Russell
; Partner's Name: Saqib Domki
; Email: rhrussell@tamu.edu
; Date: 6/7/2020
; Class: CSCE_314
; Lab: Week 2 Question 3

(define (typeID value)
  (cond
        [(boolean? value) "Boolean"]
        [(integer? value) "Integer"]
        [(rational? value) "Float"])
)

(define (main)
  (display (typeID 2022))
  (newline)
  (display (typeID #t))
  (newline)
  (display (typeID 20.22))
  (exit)
)

(main)
