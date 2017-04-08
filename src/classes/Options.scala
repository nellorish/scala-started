/**
  * Created by mnello200 on 3/28/2017.
  */
class Employee(firstName:String, middleName:Option[String],lastName:String){

     def this(firstName:String,middleName:String,lastName:String)=
         this(firstName,Some(middleName),lastName)

     def this(firstName:String,lastName:String)=
           this(firstName, None,lastName)

      def this()= this("Unknown","Unknown")
}


 object OptionRunner extends App {

   val me = new Employee("Madan","Mohan","Nellore")
   val mewithNoMiddleName= new Employee("Madan","Nellore")

   val stranger = new Employee

   println(stranger)

 }