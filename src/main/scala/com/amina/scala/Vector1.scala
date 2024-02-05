package com.amina.scala

object Vector1 {
  def main(args:Array[String]):Unit={
  val vector1:Vector[String]=Vector("Plain Donut", "Strawberry Donut", "Chocolate Donut")
    println(vector1)
    println(vector1(0))
    val vector2:Vector[String]=vector1:+"Vanilla Donut"
println(vector2)
    val vector4 = vector1 ++ Vector[String]("Glazed Donut")
    println(vector4)
    val emptyVector: Vector[String] = Vector.empty[String]
    println(emptyVector)
  }

}
