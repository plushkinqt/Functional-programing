package Collections

import scala.collection.immutable.{Queue, Stack}

/**
 * Trait Seq
 */
object ImmutableSeq extends App{

  //Nil special case of empty List, this is immutable linked list
  val coll:List[Int] = Nil
  //Lazy list that will be calculated when one of its elements is needed
  val coll2:Stream[Int] = Stream()
  //Stack is deprecated, because immutable list substitute it fine
  val coll3:Stack[Int] = Stack()
  //FIFO
  val coll4:Queue[Int] = Queue()

  /**
   * Subtrait IndexedSeq
   * It has fast random access to an element
   */

  //Tree with node up to 32 element
  val coll5:Vector[Any] = Vector()
  //Range saves only start, end elements and increment value
  val coll6:Range = 1 to 6

  //Result of sum of immutable lists a new immutable list
  val newcoll:List[Int] = 9 :: 10 :: coll

  //h = head, t = tail
  def multi(list: List[Int]): Int = list match {
    case Nil => 1
    case h :: t => h * multi(t)
  }

}
