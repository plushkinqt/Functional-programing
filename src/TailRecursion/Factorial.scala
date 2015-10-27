package TailRecursion

/**
 * Created by yevgen on 10/27/15.
 */
object Factorial{
  /**
   * Advantages of tail recursion: it doesn't cause stack overflow after couple hundreds calls
   * because it uses only one frame and if compiler optimized then it's faster then forward recursion
   */
  def calculate (x: Int) :Int = {
    def loop(remainder: Int, current: Int): Int = {
      if (remainder == 0) current else loop(remainder-1, current * remainder)
    }
    loop(x,1)
  }

}
