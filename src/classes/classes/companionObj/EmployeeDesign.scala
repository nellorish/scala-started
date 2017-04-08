import java.time.LocalDate



/**
  * Created by mnello200 on 3/28/2017.
  */

class  Employee2 protected (val firstName:String,val lastName:String, val title:String,val hireDate:LocalDate)



object Employee2{



  def create(firstName:String,lastName:String,title:String)=
    new Employee2(firstName, lastName, title, LocalDate.now())


  def create(firstName:String,lastName:String,title:String,hireDateDate: LocalDate)=
    new Employee2(firstName, lastName, title, hireDateDate)

}



object EmployerRunner extends App{

  val emp1 = Employee2.create("Nellore","Mohan","Developer")

  println(emp1.hireDate)



}