package ProjectEuler

/**
 * What is the 10001st prime number?
 */
object Problem7 {

  def calculate(lookingFor: Int): Int ={
    var counter = 1
    for(number <- 3 to Int.MaxValue by 2){
      if(!(2 to Math.ceil(Math.sqrt(number)).toInt).exists(number % _ == 0)) {
        counter += 1
        if(counter == lookingFor) return number
      }
    }
    -1
  }
  val result = calculate(10001)
  //Answer: 104743
}
