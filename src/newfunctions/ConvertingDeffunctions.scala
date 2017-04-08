/**
  * Created by mnello200 on 4/7/2017.
  */
class Foo(x:Int){

   def bar(y:Int)={
     x+y
   }
}

class Baz(x:Int){

  def qux(f:Int =>Int)= f(x)
}


object MyObject extends App{

  val foo = new Foo(20)

  val f = foo.bar _

  val bax = new Baz(20)

  bax.qux(f)


}