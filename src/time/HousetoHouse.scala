import java.util.Date

import scala.collection.mutable.ArrayBuffer

/**
  * Created by mnello200 on 3/29/2017.
  */
  object sampleRunner extends App {

  val initialList = ArrayBuffer.empty[Date]

  val mergePartitionLists = (p1: ArrayBuffer[Date], p2: ArrayBuffer[Date]) => p1 ++= p2

  println(mergePartitionLists)

  println(initialList);

}