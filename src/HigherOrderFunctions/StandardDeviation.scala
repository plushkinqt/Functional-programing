package HigherOrderFunctions

/**
 * Created by yevgen on 10/28/15.
 */
object StandardDeviation {

  /**
   * First standard deviation without higher order function.
   * It is divided to three parts: mean value, variance and deviation itself
   */
  def mean(values: List[Double]) : Double= {
    var accumulator: Double = 0
    values.foreach(element => {
      accumulator += element
    })
    accumulator /= values.length
    accumulator
  }

  def variance(values: List[Double], mean: Double): Double = {
    var accumulator: Double = 0
    values.foreach(element => {
      accumulator += Math.pow(element - mean, 2)
    })
    accumulator /= values.length //for population so no -1
    accumulator
  }

  def deviation(variance: Double): Double =
    Math.sqrt(variance)

  def calculate(values: List[Double]): Double =
    deviation(variance(values, mean(values)))


  /**
   * In second case function with calculations of mean value is passed as a parameter to
   * improved variance function as function "f" what receives list of doubles and return double
   */
  def impVariance(f: List[Double] => Double, values: List[Double]): Double = {
    val meanVal = f(values)
    var accumulator: Double = 0
    values.foreach(element => {
      accumulator += Math.pow(element - meanVal, 2)
    })
    accumulator /= values.length
    accumulator
  }

  def impCalculate(values: List[Double]): Double =
    deviation(impVariance(mean, values))


}
