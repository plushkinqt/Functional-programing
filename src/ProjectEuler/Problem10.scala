package ProjectEuler

/**
 * Find the sum of all the primes below two million.
 */
object Problem10 {

  def calculate(till: Int): Long ={
    var sum: Long = 0
    for(number <- 3 to till by 2){
      if(!(2 to Math.ceil(Math.sqrt(number)).toInt).exists(number % _ == 0)) sum += number
    }
    sum + 2
  }

  val result = calculate(2000000)
  //Answer: 142913828922

}
