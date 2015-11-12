package ProjectEuler

import HigherOrderFunctions.FunctionAsResult._
import scala.annotation.tailrec

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Problem4{

  def calculate(): Int = {
    var temp = 0
    for (y <- 999 to 1 by -1) {
      val res = highestPalindrome(y, 999)
      if(res > temp) temp = res
      if(temp > y * 999) return temp
    }
    temp
  }

  @tailrec
  def highestPalindrome(y: Int, x: Int): Int ={
    if(palindromeImproved(x * y)) x * y
    else highestPalindrome(y, x - 1)
  }

  val result = calculate()//Answer: 906609

}
