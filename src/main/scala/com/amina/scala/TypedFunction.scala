package com.amina.scala

object TypedFunction {
  def main(args: Array[String]): Unit = {
    def applyDiscount[T](discount: T) {
      discount match {
        case d: String =>
          println(s"Lookup percentage discount in database for $d")

        case d: Double =>
          println(s"$d discount will be applied")

        case _ =>
          println("Unsupported discount type")
      }
    }
    println("\nStep 5: How to call a function which has typed parameters")
    applyDiscount[String]("COUPON_123")
    applyDiscount[Double](10)
  }
}
