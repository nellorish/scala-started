/**
  * Created by mnello200 on 4/4/2017.
  */

object NewFunction extends App {


   val f1 = (x: Int) =>x+1

   val function3  = (int1:Int, int2:Int) => (int1+int2).toString

   val f0 =() =1
   val f2= (v1: Int, v2: String) => v2+v1

   val f5= (x:String)=> (x,x.size)


  println(f1(1))
  println(f0)
  println(f2(2, "WOW"))

  val someFunction =(s:String) =>  (s, s.size)














}

