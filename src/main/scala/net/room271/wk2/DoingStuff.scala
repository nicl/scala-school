package net.room271.wk2

import scala.annotation.tailrec

object DoingStuff {

  /*
   * This week we'll cover:
   * - methods and functions
   * - collections
   */

  // A kind of useful cheatsheet
  // http://docs.scala-lang.org/cheatsheets/?_ga=1.155341435.1933725305.1400853996

  // http://docs.scala-lang.org/overviews/collections/overview.html

  val myList = List(1, 2, 3)
  val myVector = Vector(1, 2, 3)
  val mySet = Set(1, 2, 3)
  val myMap = (1 -> 'a', 2 -> 'b', 3 -> 'c')

  // :+ to add, or ::/+: for Lists
  // :- to remove
  // +/- for sets and maps
  // index access e.g. Vector(1, 2)(2) (!)

  // Declaring methods

  def myFunction(a: Int, b: Int): Int = {
    a + b
  }

  // Declaring functions

  val addOne = (a: Int) => a + 1 // can be _ + 1 with type inference

  // Note, lots of ways to declare functions:
  // http://docs.scala-lang.org/style/declarations.html#function_values

  val someNumbers = List(-1, 0, 4, 5)

  // Filter a collection by elements which are positive
  val posNumbers = someNumbers.filter(x => x > 0)

  // Double all numbers in a collection
  val doubled = ???

  // sum all numbers in a collection
  val summed1 = someNumbers.sum // cheating!
  val summed2 = someNumbers.fold(0)(_ + _)

  // print all items in a collection (hint: println will print stuff to standard out)

  // all are equivalent...
  for (number <- someNumbers) println(number)
  someNumbers.foreach(println) // pass just function
  someNumbers.foreach(println(_)) // with underscore argument
  someNumbers foreach { number => println(number) } // more explicit, uses 'operator' notation (i.e. no dot method calls)
  someNumbers foreach println // most succinct

  // More advanced...

  // implement your own filter function for List[Int] (hint, use recursion, .head, .tail, and ::)
  def filter(list: List[Int], f: Int => Boolean): List[Int] = {
    @tailrec
    def loop (input: List[Int], output: List[Int]): List[Int] = {
      if (input.isEmpty) output
      else if (f(input.head)) loop(input.tail, input.head :: output)
      else loop(input.tail, output)
    }

    loop(list, Nil)
  }

  // note, this is a recursive definition which could cause a stack overflow.
  // The @tailrec annotation can give a compile-time warning against this

  // implement a simple factorial function (hint, use fold)
  def factorial(n: Int): Int = {
    (1 to n).fold(0)(_ * _) // note 1 to n is a 'range'
  }

  // write some tests for the above!

}
