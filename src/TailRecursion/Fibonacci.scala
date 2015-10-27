package TailRecursion

/**
 * Created by yevgen on 10/27/15.
 */
object Fibonacci {

  /**
   * Fibonacci sequence with tail recursion.
   * Increased performance in compare with direct recursion, because in this case it is not needed to call
   * twice recursive function after each computation. In this case two values from previous computations
   * are passed to next function call.
   */
  def calculate (x: Int): Int = {
    def loop(iterator: Int, prev: Int, current: Int): Int =
      if(iterator == 0) current else loop(iterator - 1, current, current + prev)
    loop(x ,1, 0)
  }

  /**
   * And with pattern matching
   */
  def fibonacci (x: Int): Int = {
    def loop(iterator: Int, prev: Int, current: Int): Int = {
      iterator match {
        case 0 => current
        case _ => loop(iterator - 1, current, current + prev)
      }
    }
    loop(x ,1, 0)
  }

}
