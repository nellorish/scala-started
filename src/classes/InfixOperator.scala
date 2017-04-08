/**
  * Created by mnello200 on 3/28/2017.
  */

class Foo(a:Int){

     def bar(b:Int) = a+b
     def baz(b:Int,c:Int) = a+b+c
}

object InfixOperatorRunner extends App{

  val foo = new Foo(1)

  println(foo bar 5)

  println(foo  baz (1, 2))

  println()


}