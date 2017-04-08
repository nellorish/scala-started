/**
  * Created by mnello200 on 3/28/2017.
  */

class Foo(a:Int){

  def apply (b:Int) = a+b
}


object MagicRunner extends App{

  val fooNumber = new Foo(3);
  println(fooNumber(6))

}