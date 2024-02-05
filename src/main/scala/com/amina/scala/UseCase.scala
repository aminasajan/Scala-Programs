package com.amina.scala

object UseCase {
  def main(args:Array[String]):Unit= {
    case class Donut(name: String="ji", price: Double, productCode: Option[Long] = None)
    val vanillaDonut: Donut = Donut("Vanilla Donut", 1.50,Some(1111))
    val glazedDonut: Donut = Donut("Glazed Donut", 2.0)
    println(s"Vanilla Donut = $vanillaDonut")
    println(s"Glazed Donut = $glazedDonut")
    println(vanillaDonut.name)
    println(vanillaDonut.productCode)
    type CartItem[Donut,Int]=Tuple2[Donut,Int]
    val cartItem=new CartItem(vanillaDonut,4)
    println(cartItem._1)
    println(cartItem._2)

    def calculateTotal(shoppingCartItems:Seq[CartItem[Donut, Int]]):Double={
      shoppingCartItems.foreach{ cartItem =>
        println(cartItem._1)
        println(cartItem._2)
      }
      10
    }

    calculateTotal(Seq(cartItem))
object DonutImplicits{
  implicit class AugmentedDonut(donut:Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"

    //uuid method add instances of the Donut class by the use of implicit class
//  since the class is implicit, all the instances of donut will be automatically converted to AugmentedDonut when needed
// import DonutImplicits._, you make the implicit class AugmentedDonut available in the current scope.
// call uuid on a Donut instance (e.g., vanillaDonut.uuid), the implicit conversion kicks in. The Donut instance is automatically converted to an AugmentedDonut, allowing you to use the uuid method.
  }
}
 import DonutImplicits._
    println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

  }

}
