/**
  * Created by mnello200 on 3/29/2017.
  */
object Lists extends App{

  val a = List(1,2,3,4,5,5)

  val a3 = List.apply(6,7,8,9,10)

 // val a2 = 1 :: 2 :: 3 :: 4 :: 5 :: 6

  println(a union a3)

  println(a ++ a3)

  println( a diff a3)

  println(a.head)

  println(a.tail)

  println(a.min)

  println(a.max)

  println(a.nonEmpty)

  println(a.isEmpty)

  println(a.drop(3))

  println(a.mkString("*"))

}
