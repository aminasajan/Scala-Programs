package com.amina.scala

import scala.collection.immutable.ListSet

object MyList {
def main(args:Array[String]):Unit={
val list1:List[String]=List("Plain Donut","Strawberry Donut","Chocolate Donut")
println(s"Elements of list1= $list1")
  println(list1(0))
  val list2:List[String]=list1:+"Vanilla Donut"
  print("list2: ")
  println(list2)
  val list3:List[String]="Cadburry Donut"+:list2
  print("list3: ")
  println(list3)
  val list4:List[Any]=list1::list2
  println(list4)
  val list5:List[String]=list1:::list2
  println(list5)
val emptyList:List[Any]=List.empty[String]
  print(emptyList)
}
}
