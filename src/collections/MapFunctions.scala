/**
  * Created by mnello200 on 3/29/2017.
  */
object MapFunctions extends App {

  val a =List(1,2,3,4,5,6)
  val f =(x:Int)=> x+1

  println(a.map(f))

  println(a.map((x:Int) =>x+1))

  println(a.map(x=>x+1))
  //Look more into Functions
  println(a.map(_+1))

}
