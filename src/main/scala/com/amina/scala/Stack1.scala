package com.amina.scala
import scala.collection.immutable.Stack
object Stack1 {
def main(args:Array[String]):Unit={
  val stack2:Stack[String]=Stack("Plain Donut","Strawberry Donut","Glazed Donut")
  println(stack2)
  val stack3:List[String]=List("Plain Donut","Strawberry Donut","Glazed Donut")
  println(stack3)
  val stack4:List[String]="Vanilla DOnut" :: stack3
  println(stack4)
  val stack5: List[String] = "Glazed Donut" :: "Vanilla Donut" :: stack4
  println(stack5)
  val stack6:List[String]=stack5.tail
  println(stack6)
  val stack7:List[String]=List.empty[String]
  print(stack7)
}
}
