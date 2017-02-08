/**

Question: Write a program using string interpolation and a list.
For example: if the list is List(10,20,30,40) output should be
0 = 10
1 = 20
3 = 30

**/

object DisplayList extends App {
  val list = List(10, 20, 30, 40)
  list.foreach(item => println(s"${list.indexOf(item)} = $item"))
}

