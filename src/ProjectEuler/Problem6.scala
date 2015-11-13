package ProjectEuler

/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
object Problem6 {

  def calculate(last: Int): Long ={
    val squareOfSum = Math.pow((1 to last).sum, 2).toLong
    var sumOfSquares: Long = 0
    (1 to last).foreach(x => sumOfSquares += (x * x))
    squareOfSum - sumOfSquares
  }

  val result = calculate(100)
  //Answer: 25164150

}
