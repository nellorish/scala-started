import classes.{Department, Manager}

/**
  * Created by mnello200 on 3/27/2017.
  */

val ada = new Employee("Mohan","Nellore")

//val newAda = ada.copyObject(lastName = "Dasari")

//println(ada.firstName)
//
//println(ada.fullName)
//
//println(newAda.fullName)

//try {
//  new Employee("Madan", "Nellore", title = "Junior");
//} catch {
//  case excep: IllegalArgumentException => println(excep.getMessage)
//}


val dept = new Department("Mathematics")

val manager = new Manager("managerfirstName","managerLastName",title = "Manager",dept)

println(manager.department.name)

