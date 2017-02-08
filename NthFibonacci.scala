/**

Question 3: Write a program to get the nth Fibonacci number.
Input: n = 3
Output: 2

**/




object NthFibonacci extends App {
  
  def getFibonacci(number:Int):Int = {
    def getFibonacciTail(number:Int,num1:Int,num2:Int):Int = {
      number match {
        case 1 => num1
        case _ => getFibonacciTail(number-1,num2,num1+num2)
      }
    }
    getFibonacciTail(number,1,1)
  }

  val fibonacci1 = getFibonacci(3)
  val fibonacci2 = getFibonacci(6)

  println(fibonacci1)
  println(fibonacci2)
}

