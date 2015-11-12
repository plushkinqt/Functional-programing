package TailRecursion

import scala.annotation.tailrec

/**
 * Project euler problem 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
object Euler3 {

  //@tailrec is a method annotation which verifies that the method will be compiled with tail call optimization.
  @tailrec
  def prime(max: Long, num: Long): Long = {
    if (max >= num) max
    else if (num % max == 0) prime(max, num / max)
    else prime(max + 1, num)
  }

  val answer = prime(2L,600851475143L)//Answer: 6857
}
