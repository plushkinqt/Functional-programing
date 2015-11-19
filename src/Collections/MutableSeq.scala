package Collections

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created by yevgen on 11/18/15.
 */
object MutableSeq {

  val coll:ArrayBuffer[Int] = new ArrayBuffer()

  val coll2 = new mutable.Stack[Int]()
  coll2.push(1)
  coll2.pop()

  val coll3 = new mutable.Queue[Int]()
  coll3.enqueue(3)
  coll3.dequeue()

  val coll4 = new mutable.PriorityQueue[Double]()

  //Both are deprecated. RIP
  val coll5 = new mutable.LinkedList()
  val coll6 = new mutable.DoubleLinkedList()

  //And mutable list hurry to help us with
  val coll7 = new mutable.MutableList()

  //Basic operation on mutable collection
  coll += 3
  coll += (4,5,6)
  coll ++= new ArrayBuffer(7)
  coll -= 7
  coll -= (6,5)
  coll --= new ArrayBuffer[Int](3)
  //only for ArrayBuffer
  2 +=: coll
  new ArrayBuffer(7) ++=: coll

}
