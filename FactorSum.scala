/**

Question 4: Write a program to sum of the digits of the product of number from 1 to n.
Example: n = 5
1*2*3*4*5 = 120
1+2+0 = 3

**/

object FactorSum extends App {
  
  def getFactor(number:Int):Int = {
    def getFactorTail(number:Int,tail:Int):Int = {
      number match {
        case 0 => tail
        case _ => getFactorTail(number-1,tail*number)
      }
    }
    getFactorTail(number,1)
  }
  
  def getSum(number:Int):Int={
    val factList = number.toString.toList
    val intList = factList.map(item=>item.getNumericValue)
    val sum = intList.foldLeft(0)(_+_)
    sum
  }

  val num = getSum(getFactor(6))
  println(num)
}

