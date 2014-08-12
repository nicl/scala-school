package net.room271.wk3

/**
 * Design a class for rational numbers
 *
 * The class should enable us to write code like
 *
 * val x = new Rational(1, 2)
 * val y = new Rational(2, 3)
 *
 * x + y
 * -> Rational = 7/6
 */

class Rational(n: Int, d: Int) {

  val numer = n
  val denom = d

  // auxiliary constructor
  def this(n: Int) = this(n, 1)

  override def toString = ???

  def + (that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  def * (that: Rational): Rational = ???

  def - (that: Rational): Rational = ???

  // Questions:
  // - implement methods for Ints too (e.g. so that 2/3 * 1 works)
  // - what are the limitations of the current approach?
  // - can we make 2 * r work? (Where 'r' is a rational)
}
