package com.amina.scala

object VariableArgument {
def main(args:Array[String]):Unit={
  def printReport(names:String*): Unit = {
    println(s"""Donut Report=${names.mkString("-")}""")
  }
  printReport("glazed Donut","Strawberry Donut")
  printReport("glazed Donut")

  println("\nStep 3: How to pass a List to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(listDonuts: _*)

  println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")

  printReport(seqDonuts:_*)

  println("\nStep 5: How to pass an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")
  printReport(arrDonuts:_*)
}
}
