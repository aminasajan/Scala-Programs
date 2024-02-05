package com.amina.scala

object Function2 {
  def main(args:Array[String]):Unit={
//   1. How to define a function which returns an Option of type String
    println(s"Step 1: Define a function which returns an Option of type String")
    def dailyCouponCode:Option[String]= {
      val couponFromdb = "COUPON_1234"
      Option(couponFromdb).filter(_.nonEmpty)
    }
      println(s"\nStep 2: Call function with Option return type using getOrElse")
      val todayCoupon: Option[String] = dailyCouponCode
      println(s"Today's coupon code = ${todayCoupon.getOrElse("No Coupon's Today")}")

    println(s"\nStep 3: Call function with Option return type using pattern matching")
    dailyCouponCode match {
      case Some(couponCode) => println(s"Today's coupon code = $couponCode")
      case None => println(s"Sorry there is no coupon code today!")
    }

    println(s"\nStep 4: Call function with Option return type using map")
    dailyCouponCode.map(couponCode=>println(s"Today's coupon code = $couponCode"))



    println(s"Step 1: How to define a function with an implicit parameter")
    def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
      println(s"Calculating the price for $quantity $donutType")

      val totalCost = 2.50 * quantity * (1 - discount)
      totalCost
    }
    println("\nStep 2: How to define an implicit value")
    implicit val discount: Double = 0.1
    println(s"All customer will receive a ${discount * 100}% discount")

    println("\nStep 3: How to call a function which has an implicit parameter")
      println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost("Glazed Donut", 5)}""")


    println("\nStep 4: How to define a function which takes multiple implicit parameters")
    def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
      println(s"[$storeName] Calculating the price for $quantity $donutType")
      val totalCost = 2.50 * quantity * (1 - discount)
      totalCost
    }
      println("\nStep 5: How to call a function which takes multiple implicit parameters")
      implicit val storeName: String = "Tasty Donut Store"
      println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost2("Glazed Donut", 5)}""")

    println("\nStep 6: How to manually pass-through implicit parameters")
    println(s"""Total cost with discount of 5 Glazed Donuts, manually passed-through = ${totalCost2("Glazed Donut", 5)(0.1, "Scala Donut Store")}""")

  }

}
