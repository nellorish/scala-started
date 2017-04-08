/**
  * Created by mnello200 on 3/27/2017.
  */
import scala.annotation.tailrec


@tailrec
def fact(x:BigInt,acc:BigInt):BigInt={

  if(x==0||x==1) acc
  else fact(x-1,acc*x)
}

def factorial(n:BigInt) = fact(n,1)

println(fact(5,1))