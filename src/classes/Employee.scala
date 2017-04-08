package classes

/**
  * Created by mnello200 on 3/27/2017.
  */
class Employee (val firstName:String, val lastName:String,val title:String ="something") {

  //def this(firstName:String, lastName:String) = this(firstName, lastName, "something")

   require(firstName.nonEmpty,"FirsstName Cannot be Empty")
  require(lastName.nonEmpty, "Last name is Manditory")

    if(title.contains("Senior")|| title.contains("Junior"))
       throw new IllegalArgumentException("Title cannot contain Senior or Junior")


  def fullName = s"$firstName $lastName"

  def copyObject(firstName:String=this.firstName, lastName:String=this.lastName,title:String=this.title) = {
    new Employee(firstName= firstName,lastName=lastName,title=title)

  }

}

class Department(val name:String)

class Manager(firstName:String,lastName:String,title:String, val department:Department) extends Employee(firstName,lastName,title)