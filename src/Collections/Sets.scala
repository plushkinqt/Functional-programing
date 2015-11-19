package Collections

import scala.collection.mutable

/**
 * Scala set same as java set contains only one unique elements
 */
object Sets{

  //By default it is unordered hashset
  val coll = Set[Int](2,3,3)

  val coll4 = mutable.Set[Int]()

  var coll2= mutable.LinkedHashSet[Int]()

  val coll3 = mutable.SortedSet
  //Adding and removing elements like in sequences
  coll2 += (3,4,5)

  //Result all unique elements in bots sets
  val union = coll | coll2

  //Result only elements that exist in both collections
  val interception = coll & coll2

  //Result only elements from first set that are not present in second one
  val difference = coll &~ coll2

}
