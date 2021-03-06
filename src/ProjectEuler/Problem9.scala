package ProjectEuler

/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
object Problem9 extends App{

  def calculate(sum: Int): Int ={
    for(c <- 1 to sum -2; a<- 1 until c){
      val b = sum - a - c
      if(a*a+b*b == c*c) return a*b*c
    }
    -1
  }
  val result = calculate(1000)
  //Answer: 31875000
}
