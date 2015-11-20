package Collections

/**
 * Created by yevgen on 11/20/15.
 */
object MapsAndTuples {
  //More readable creation of map
  val coll = Map("x" -> 1, "y" -> 2, "z" -> 3)
  //and old fasioned way
  val coll2 = Map(("x", 3), ("y", 4), ("z", 5))

  var coll3:Map[Char,Int] = Map()

  coll3 += ('I' -> 1)


  //tuple of two: string and int
  val hostPort = ("localhost", 80)

  //tuple of three: latitude, longitude and height
  val location = (60.123456, 24,123456, 20)

  val lat = location._1
  //tuples can have till 22 element
}
