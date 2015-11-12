package HigherOrderFunctions

/**
 * New control flow statements with Scala
 */
object ControlFlow {

  /**
   * Do while statement with use of call by value curring and passing block of code as a parameter
   */
  def doWhileByValue(condition: () => Boolean)(block: () => Unit): Int = {
    while(true){
      block()
      if(!condition()) return 1
    }
    0
  }

  var x = 0

  /**
   * Example of call of our condition
   */
  doWhileByValue(() => x < 5)(() => {
    x += 1
    println(x)
  })

  /**
   * Same with use call by name, what make code more readable
   */
  def doWhile(condition: => Boolean)(block: => Unit): Int = {
    while(true){
      block
      if(!condition) return 1
    }
    0
  }

  /**
   * And call doWhile statement with use call by name
   */
  x = 0
  doWhile(x < 5)({
    x+=1
    println(x)
  })

}
