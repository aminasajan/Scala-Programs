package com.amina.scala

object Functions {
  def main(args: Array[String]): Unit = {
    //  1. How to define and use a function which has no parameters and has a return type
    println("Step 1: How to define and use a function which has no parameters and has a return type")

    def favoriteDonut(): String = {
      "Glazed Donut"
    }

    val myFavoriteDonut = favoriteDonut()
    println(s"My favourite donut=$myFavoriteDonut")

    //  2. How to define and use a function with no parenthesis
    println("\nStep 2: How to define and use a function with no parenthesis")

    def leastFavouriteDOnut = "Plain Donut"

    println(s"My least favourite donut = $leastFavouriteDOnut")

    //  3. How to define and use a function with no return type
    println("\nStep 3: How to define and use a function with no return type")

    def printDonutSalesReport(): Unit = {
      println("Printing donut sales report... done!")
    }

    printDonutSalesReport()

    //1. How to define function with parameters
    println("Step 1: How to define function with parameters")

    def calculateDOnutCost(donutName: String, quantity: Int): Double = {
      println(s"Calculating cost of $donutName, quantity= $quantity")
      2.50 * quantity
    }

    //    2. How to call a function with parameters
    println("\nStep 2: How to call a function with parameters")
    val totalCost = calculateDOnutCost("Glazed Donut", 5)
    println(s"Total cost of donuts= $totalCost")

    //  3. How to add default values to function parameters
    println("\nStep 3: How to add default values to function parameters")

    def calculateDonutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
      2.50 * quantity
    }

    calculateDonutCost2("Plain Donut", 4, "Code")
    calculateDonutCost2("Plain Donut", 4)

    //  1. How to define an Option in a function parameter
    println("Step 1: How to define an Option in a function parameter")

    def calculateDonutCost3(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")
      couponCode match {
        case Some(coupon) =>
          val discount = 0.1
          val totalCost = 2.50 * quantity * (1 - discount)
          totalCost
        case None =>
          val totalCost = 2.50 * quantity
          totalCost

      }
    }
      //      2. How to call a function which has an Option parameter
      println("\nStep 2: How to call a function which has an Option parameter")
      println(s"""Total cost = ${calculateDonutCost3("Glazed Donut", 5, None)}""")

// 3. How to assign a default value to an Option parameter
    println("\nStep 3: How to assign a default value to an Option parameter")
    def calculateDonutCostWithDefaultOptionValue(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")

      couponCode match{
        case Some(coupon) =>
          val discount = 0.1
          val totalCost = 2.50 * quantity * (1 - discount)
          totalCost

        case _ => 2.50 * quantity
        totalCost

      }
    }

    println("\nStep 4: How to call a function which has an Option parameter with a default value")
    println(s"""Total cost = ${calculateDonutCostWithDefaultOptionValue("Glazed Donut", 5)}""")
    println(s"""Total cost with discount = ${calculateDonutCostWithDefaultOptionValue("Glazed Donut", 5, Some("COUPON_1234"))}""")

  }
}