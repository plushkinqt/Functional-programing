package HigherOrderFunctions

/**
 * Project euler problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object ParameterInference {

  /**
   * Anonymous function is used to find multiples
   */
  val module = (x: Int) =>
    if (x %3 == 0 || x % 5 == 0) true
    else false

  /**
   * Parameter inference is used for filtering and sum itself
   */
  def calculate =
    (1 to 999) filter (module(_)) reduceLeft(_ + _)
  //Answer: 233168
}
