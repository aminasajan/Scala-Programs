package com.amina.scala

object Donut2 {
def apply(name:String):Donut2={
  name match{
    case "Glazed Donut"=>new GlazedDonut(name)
    case "Vanilla Donut"=>new VanillaDonut(name)
  }
}

  }
class Donut2(name:String,productCode:Option[Long]=None)
{
  def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")
}
class GlazedDonut(name:String) extends Donut2(name)
class VanillaDonut(name: String) extends Donut2(name)
object DonutApp {
  def main(args: Array[String]): Unit = {
    val glazedDonut = Donut2("Glazed Donut")// Uses the apply method of the Donut2 object to create an instance of GlazedDonut
    val vanillaDonut = Donut2("Vanilla Donut")//Uses the apply method to create an instance of VanillaDonut.
    glazedDonut.print
    vanillaDonut.print
  }
}
