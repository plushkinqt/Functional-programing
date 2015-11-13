package ProjectEuler

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
object Problem5{

  // 1 - 10 are not needed because thea are primes in other dividers
  // and 20 is not needed because of 20 incrementation
  val divider = 11 to 19
  def calculate(): Int ={
    for(x <- 20 to Int.MaxValue by 20){
      divider.find(x % _ != 0) match {
        case None => return x
        case _ =>
      }
    }
    -1
  }

  val result = calculate()
  //Answer: 232792560
}

