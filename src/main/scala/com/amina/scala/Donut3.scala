package com.amina.scala

object Donut3 {
  private val uuid = 1

  class Donut3(name: String, productCode: Option[Long] = None) {
    def print: Unit = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")
  }

  object Donut3 {

  def apply(name: String="nu", productCode: Option[Long]=None): Donut3 = {
    new Donut3(name, productCode)
  }

  def apply(name: String): Donut3 = {
    new Donut3(name)
  }
}
  class GlazedDonut(name:String) extends Donut3(name)
  class VanillaDonut(name: String) extends Donut3(name)
  def main(args:Array[String]):Unit= {
    val glazedDonut = Donut3("Glazed Donut", Some(1111))
    val vanillaDonut = Donut3("Vanilla Donut")
    glazedDonut.print
    vanillaDonut.print


  }
}
