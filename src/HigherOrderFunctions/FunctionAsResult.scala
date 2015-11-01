package HigherOrderFunctions

/**
 * Created by yevgen on 11/1/15.
 */
object FunctionAsResult {

  /**
   * Simple implementation of palindrome detection to show that function can be returned as a result
   */
  def palindrome(x: Int) = () => {
    val direct = x.toString
    if(direct.equals(direct.reverse)) true
    else false
  }

  /**
   * palindrome(value) will return anonymous function that will return a boolean
   * palindrome(value)() returns boolean value
   */
  def calculate(value:Int) = palindrome(value)()

  /**
   * In improved version of palindrome no need to traverse the whole number just half of it
   * if it's a palindrome and if not stop search at the moment algorithm found it
   */
  def palindromeImproved(x: Int): Boolean = {
    val direct = x.toString
    var l = 0
    var r = direct.length - 1
    while (r > l) {
      if(direct.charAt(r) != direct.charAt(l)) return false
      r = r - 1
      l = l + 1
    }
    true
  }
}
