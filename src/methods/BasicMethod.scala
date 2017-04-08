/**
  * Created by mnello200 on 3/26/2017.
  */

def add(x:Int,y:Int) = x+y

println(add(4,7))

def numberStatus(n:Int)={
  if(n>10) "Its greater 10"
  else if(n<0) "its less then 10"
  else "Its 10"

}

println(numberStatus(10))