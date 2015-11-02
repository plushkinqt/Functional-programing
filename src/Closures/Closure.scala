package Closures

/**
 * Closure is a function that depends on a value or variable that is outside of its scope
 */
object Closure {

  val y = 10
  /**
   * tenMultiplier is assigned a function that receives one parameter from function call and second variable
   * from outside of its scope
   */
  val tenMultiplier = (x:Int) => x * y
  //same with tenAdder
  val tenAdder = (x:Int) => x + y

  /**
   * Closure example on collection
   */
  var amount = 0
  val listAdder = (list:List[Int]) =>
    list.foreach(amount += _)


}
