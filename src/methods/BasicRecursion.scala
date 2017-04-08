
/**
  * Created by mnello200 on 3/26/2017.
  */

def fact(x:Int):Int={

  if(x==0|| x==1) 1
  else  x*fact(x-1)
}
println(fact(5))