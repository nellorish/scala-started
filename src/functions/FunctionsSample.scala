/**
  * Created by mnello200 on 3/29/2017.
  */

object Functions extends App{

  val f1:Function1[Int,Int]= new Function[Int,Int] {

    def apply(x:Int):Int = x+1
  }

  val f2:Function2[Int,String,String] = new Function2[Int,String,String] {

     def apply(x:Int,y:String): String = x+y
  }

  val f3:Function3[Int,Int,Int,String] = new Function3[Int,Int,Int,String] {


    def apply(x:Int,y:Int,Z:Int) = (x+y+Z).toString
  }

  println(f1(3))
  println(f2(1," Wow"))
  println(f3(1,2,3))
}


