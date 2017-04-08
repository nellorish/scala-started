/**
  * Created by mnello200 on 4/7/2017.
  */
object MethodOrFunction extends App{

  val f =(x:Int) => x+1

   def g(x:Int) ={
     x+1
   }

  println(MethodOrFunction.g(3))

  println(MethodOrFunction.f(3))
}
