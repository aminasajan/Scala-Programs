package com.amina.scala

object CaseClassInheritance {
  def main(args: Array[String]): Unit = {
    abstract class Donut(name:String){
      def printName: Unit
    }
    case class VanillaDonut(name:String) extends Donut(name){
      override def printName: Unit = println(name)
    }
    case class GlazedDonut(name: String) extends Donut(name) {

      override def printName: Unit = println(name)
    }
    val vanillaDonut= VanillaDonut("Vanilla Donut")
    vanillaDonut.printName
    val glazedDonut=GlazedDonut("Glazed Donut")
    glazedDonut.printName

class ShoppingCart[D<:Donut](donuts:Seq[D]){//D is the type parameter and is constrained to be a subtype of the Donut class.
def printCartItems:Unit=donuts.foreach(_.printName)
  }
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems

}
}
