package HigherOrderFunctions

/**
 * Created by yevgen on 11/15/15.
 */
object TimeMeasurement {

  /**
   * One more example how to pass block of code to another function
   * Block of code was taken as a parameter and passed as a result
   */
  def time[B](block: => B): B = {
    val timeBeforeBlock = System.nanoTime()
    val result = block
    val timeAfterBlock = System.nanoTime()
    val timeDifference = timeAfterBlock - timeBeforeBlock
    println("This block run for ns: " + timeDifference)
    result
  }

  //Example of call(call by name here, code looks better)
  val result = time{
    var x = 0
    x += 100500
    x
  }

  def timeByValue[B](block: () => B): () => B = {
    val timeBeforeBlock = System.nanoTime()
    val result = block
    val timeAfterBlock = System.nanoTime()
    val timeDifference = timeAfterBlock - timeBeforeBlock
    println("This block run for ns: " + timeDifference)
    result
  }

  //In some cases might be faster
  val resultByValue = timeByValue{ () =>
    var x = 0
    x += 100500
    x
  }
}
