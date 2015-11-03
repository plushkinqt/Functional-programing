package ScalaFeatures

/**
 * Created by yevgen on 11/2/15.
 */
object CallByNameOrValue {

  /**
   * Imitation of some really expensive computations from point of resources
   */
  val someHardComputation = () => {
    var temp: Double = 2312
    for(x <- 0 to 100000000) temp += Math.sqrt(temp)
    temp.toInt
  }

  /**
   * By default scala uses call by value, that mean that instead of variable of every parameter
   * its value is calculated before function starts its execution
   */
  def callByValue(x: Int, f: Int => Int): Int = {
    if(x == 100500) f(x)
    else x
  }

  /**
   * In call by name value of parameter is calculated when function needed it, but not before.
   * So in much cases calculation of function f() can be skipped
   */
  def callByName(x: Int, f: => () => Int): Int = {
    if(x == 100500) f()
    else x
  }

  //Example of function call
  callByName(10050, someHardComputation)



}
