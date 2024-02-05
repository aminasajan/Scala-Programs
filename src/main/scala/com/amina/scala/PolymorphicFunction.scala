package com.amina.scala

object PolymorphicFunction {
  def main(args: Array[String]): Unit = {
    println("\nStep 3: How to define a generic typed function which also has a generic return type")

    def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
      discount match {
        case d: String =>
          println(s"Lookup percentage discount in database for $d")
          Seq[T](discount)
        case d: Double =>
          println(s"$d discount will be applied")
          Seq[T](discount)

        case d @ _ =>
          println("Unsupported discount type")
          Seq[T](discount)
      }
    }
    println("\nStep 4: How to call a generic typed function which also has a generic return type")
    println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")

    println()
    println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")

    println()
    println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")
  }
}
