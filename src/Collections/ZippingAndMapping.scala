package Collections

/**
 * Created by yevgen on 11/22/15.
 */
object ZippingAndMapping {

  val coll = List(10,20,30,40)
  val coll2 = List(0.1,0.2,0.3,0.4)

  //result of zip method is new collection in this case list of tuples
  val result = coll zip coll2

  /**
   * Map applies function to a collection and produces a new collection
   */
  val multi = coll zip coll2 map {r => r._1 * r._2}

  val short = List(3,2,1)
  /**
   * zip returns a collection of length of shortest element
   * if one collection is shorter its possible to use zipAll
   * second parameter is index and third will be used when short collection ends
   */
  coll zipAll (short, 0, 1)
  println(result)
}
