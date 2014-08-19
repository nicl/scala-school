package net.room271.wk4

object Exercises {

  /**
   * Run the tests via sbt:
   *
   *     $ sbt
   *     $ test-only net.room271.wk4.ExercisesSpec
   */

  /**
   * The rules:
   *
   * Return a list for 0 to n where each item is the next number in the List, unless:
   *
   * it is divisible by 3 -> in which case return 'fizz'
   * it is divisible by 5 -> return 'buzz'
   * it is divisible by both -> return 'fizz buzz'
   *
   * e.g. fizzBuzz(3) would give List(1, 2, 'fizz')
   */
  def fizzBuzz(n: Int): List[String] = {
    val result = for (i <- (1 to n).toList) yield {
      if (i % 3 ==0 && i % 5 == 0) "fizz buzz"
      else if (i % 3 == 0) "fizz"
      else if (i % 5 == 0) "buzz"
      else i.toString
    }

    result.toList
  }


  /**
   * Return only even numbers in a list
   *
   * Hint: use filter
   */
  def filterEven(list: List[Int]): List[Int] = list.filter(_ % 2 == 0)

  /**
   * Return only odd numbers in a list
   *
   * Restriction: filter is not allowed this time!
   */
  def filterOdd(list: List[Int]): List[Int] = for (l <- list if l % 2 != 0) yield l

  /**
   * Define a map function for List[Int]
   *
   * Note, you can use for .. yield (in fact, the two are equivalent)
   */
  def map(list: List[Int], f: Int => Int): List[Int] =
    for (l <- list) yield f(l)

  /**
   * Write a function which returns the intersection of two sets.
   *
   * The intersection is the subset of items which are in both sets
   *
   * Restriction: the intersect Set method is not allowed!
   */
  def intersection(s1: Set[Int], s2: Set[Int]): Set[Int] = {
    for (elem <- s1 if s2 contains elem) yield elem
  }
}
