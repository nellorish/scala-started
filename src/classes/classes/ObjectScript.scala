/**
  * Created by mnello200 on 3/27/2017.
  */
object MyObject {
  def foo(x:Int,y:Int)=x+y

}
println(MyObject.foo(4,5))


class EmployeeInScript(val fristName:String, val lastName:String)


object employeeObj extends EmployeeInScript("NelloreLast","NelloreFirst"){

  println(employeeObj.fristName)
  println(employeeObj.lastName)
}