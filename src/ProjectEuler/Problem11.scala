package ProjectEuler

import java.util.Scanner
import scala.io.{Source, BufferedSource}
/**
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 * Grid is in the file
 */
object Problem11 {

  def readData(): Array[Array[Int]] ={
    val source:BufferedSource = Source.fromFile("inputProblem11.txt", "UTF-8")
    val array = Array.ofDim[Int](20,20)
    var row = 0
    source.getLines().foreach { ln =>
      val scanner = new Scanner(ln)
      scanner.useDelimiter("""\s""")
      for(col <- 0 until 20) {
        array(row)(col) = scanner.nextInt
      }
      row += 1
    }
    array
  }
  val data = readData()

  def calculate():Int ={
    var max = 0
    for(row <- 0 until 20; col <- 0 until 20){
      if(col <= 16){
        if ((data(row)(col) * data(row)(col+1) * data(row)(col+2) * data(row)(col+3)) > max)
          max = data(row)(col) * data(row)(col+1) * data(row)(col+2) * data(row)(col+3)
      }
      if(row <= 16){
        if ((data(row)(col) * data(row+1)(col) * data(row+2)(col) * data(row+3)(col)) > max)
          max = data(row)(col) * data(row+1)(col) * data(row+2)(col) * data(row+3)(col)
      }
      if(col <= 16 && row <= 16){
        if ((data(row)(col) * data(row+1)(col+1) * data(row+2)(col+2) * data(row+3)(col+3)) > max)
          max = data(row)(col) * data(row+1)(col+1) * data(row+2)(col+2) * data(row+3)(col+3)
      }
      if(col <= 16 && row >= 3){
        if ((data(row)(col) * data(row-1)(col+1) * data(row-2)(col+2) * data(row-3)(col+3)) > max)
          max = data(row)(col) * data(row-1)(col+1) * data(row-2)(col+2) * data(row-3)(col+3)
      }
    }
    max
  }

  val result = calculate()
  //Answer: 70600674
}
