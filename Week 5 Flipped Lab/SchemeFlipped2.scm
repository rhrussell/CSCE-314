#lang racket
;Name: Ryan Russell
;Partner's Name: Saqib Domki
;Email: rhrussell@tamu.edu
;Course: CSCE_314
;Date: 6/28/20
;Lab: Lab 5 Question 2

(define (leaf? node)
  (null? (children node)))

(define (datum node)
  (car node))

(define (children node)
  (cdr node))

(define (count-leaves tree)
  (if (leaf? tree)
      1
      (count-leaves-in-forest (children tree))
  )
)

(define (count-leaves-in-forest forest)
  (if (null? forest)
      0
      (+ (count-leaves (car forest))
         (count-leaves-in-forest (cdr forest)))
  )
)

(define (make-node datum children)
  (cons datum children))

(define (leaf datum)
  (make-node datum '())
)

(define (cities name-list)
  (map leaf name-list)
)

(define (in-tree? place tree)
  (or (equal? place (datum tree))
      (in-forest? place (children tree))
  )
)

(define (in-forest? place forest)
  (if (null? forest)
      #f
      (or (in-tree? place (car forest))
	    (in-forest? place (cdr forest)))
  )
)

(define (locate city tree)
  (if (equal? city (datum tree))
      (list city)
      (let ((subpath (locate-in-forest city (children tree))))
        (if subpath
            (cons (datum tree) subpath)
            #f))))

(define (locate-in-forest city forest)
  (if (null? forest)
      #f
      (or (locate city (car forest))
	  (locate-in-forest city (cdr forest)))))

(define world-tree2
  (make-node
   'world
   (list (make-node
          'italy
          (cities '(venezia riomaggiore firenze roma)))
         (make-node
          '(united states)
          (list (make-node
                 'california
                 (cities '(berkeley (san francisco) gilroy)))
                (make-node
                 'massachusetts
                 (cities '(cambridge amherst sudbury)))
                (make-node 'ohio (cities '(kent)))))
         (make-node 'zimbabwe (cities '(harare hwange)))
         (make-node 'china
		        (cities '(beijing shanghai guangzhou suzhou)))
         (make-node
          '(great britain)
          (list 
           (make-node 'england (cities '(liverpool)))
           (make-node 'scotland
		            (cities '(edinburgh glasgow (gretna green))))
           (make-node 'wales (cities '(abergavenny)))))
         (make-node
          'australia
          (list
           (make-node 'victoria (cities '(melbourne)))
           (make-node '(new south wales) (cities '(sydney)))
           (make-node 'queensland
		            (cities '(cairns (port douglas))))))
         (make-node 'honduras (cities '(tegucigalpa))))))

;There are two pre-built functions that help determine if a city is in the world tree.
;The first function (in-tree?) takes in a city and a tree and goes through to see
;if the city is equal to the data of a node in the tree or if the city is in the children
;of the node using the in-forest function. The second function (in-forest?) takes in a list
;children of a node and a city and determines to see if the node list of children is null
;or not. If it is null, then the function returns a false. However, if it is not null, then
;the it goes through the list of children to see if they are the city with the (in-tree?).

(define (main)
  (display "There are two pre-built functions that help determine if a city is in the world tree.")
  (newline)
  (display "The first function (in-tree?) takes in a city and a tree and goes through to see")
  (newline)
  (display "if the city is equal to the data of a node in the tree or if the city is in the children")
  (newline)
  (display "of the node using the in-forest function. The second function (in-forest?) takes in a list")
  (newline)
  (display "children of a node and a city and determines to see if the node list of children is null")
  (newline)
  (display "or not. If it is null, then the function returns a false. However, if it is not null, then")
  (newline)
  (display "the it goes through the list of children to see if they are the city with the (in-tree? Here are a few examples:\n")
  (display (in-tree? 'berkeley world-tree2))
  (newline)
  (display (in-tree? 'austin world-tree2))
  (newline)
  (display (in-tree? 'college_station world-tree2))
)

(main)