package com.amina.scala
object Donut1 {
  def apply(name: String, productCode: Long): Donut1 = {
    new Donut1(name, productCode)
  }
  def main(args:Array[String]):Unit={
    val glazedDonut=Donut1("Glazed Donut",1111)
    val vanillaDonut = Donut1("Vanilla Donut", 2222)
    glazedDonut.print
    vanillaDonut.print
  }
}
class Donut1(name:String,productCode:Long) {
  def print = println(s"Donut name = $name, productCode = $productCode")
}