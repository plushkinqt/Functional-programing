package HigherOrderFunctions

/**
 * Curring is a process to split function that receives multiple parameters into functions that receive only one parameter
 * and return another function that receives second parameter and return a function and so on.
 */
object Curring {

  /**
   * Basic function that add two arguments
   */
  def summer(x: Int, y: Int) : Int = x + y
  val sum = summer(4, 5)

  /**
   * Intermediate function that take one parameter and return another function, what takes second parameter and returns sum
   */
  def summer2(x: Int) = (y: Int) => x + y
  val sum2 = summer2(4)(5)

  /**
   * A shortcut version to implement curring in Scala
   */
  def summer3(x: Int)(y: Int) = x + y
  val sum3 = summer3(4)(5)
}
