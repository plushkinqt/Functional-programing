package Collections

/**
 * Created by yevgen on 11/21/15.
 */
object ReduceFoldScan {

  val coll = List(5,8,10,3)

  /**
   * cumulate a single result start from the left element
   * ((5 - 8) - 10) - 3
   */
  val r = coll.reduceLeft(_ - _)
  /**
   * cumulate a single result start from the right element
   * 5 -(8 -(10 - 3))
   */
  val l = coll.reduceRight(_ - _)
  /**
   * same as reduce but with starting value
   */
  val fl = coll.foldLeft(-10)(_ + _)
  val fr = coll.foldRight(-10)(_ + _)
  //same but with /: and :\ operator
  (-10 /: coll)(_ + _)
  (coll :\ -10)(_ + _)

  /**
   * same as previous but with a collection of intermediate results
   */
  val sl = coll.scanLeft(-10)(_ - _)
  val sr = coll.scanRight(-10)(_ - _)
}
