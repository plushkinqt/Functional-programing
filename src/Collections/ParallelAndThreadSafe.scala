package Collections

/**
 * Scala introduces easy way to handle parallel threads in colllections
 */
object ParallelAndThreadSafe extends App{


  val coll = List(10,20,30,40)
  //par method adds parallel implementation to collection
  val result = coll.par.takeWhile(_ < 100).sum
  //only works with right associative operations

  //next doesn't work
  val fail = coll.par.fold(0)(_ - _)
}
