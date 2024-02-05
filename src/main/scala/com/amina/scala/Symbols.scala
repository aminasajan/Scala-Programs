package com.amina.scala

object Symbols {
  def main(args:Array[String]):Unit= {
    class DonutCostCalculator {
      val totalCost = 100

      def minDiscount(discount: Double): Double = {
        totalCost - discount
      }
      def -(discount:Double):Double={
        totalCost-discount
      }
      // Step 6: How to define function whose name is just the symbols +++
      def +++(taxAmount: Double): Double = {
        totalCost + taxAmount
      }
    }
      val donutCostCalculator = new DonutCostCalculator()
      val discountedCost = donutCostCalculator.minDiscount(10.5)

      println(s"Total Cost after discount = $discountedCost")
    println("\nStep 4: How to call function whose name is just the symbol -")
    println(s"Calling function -=${donutCostCalculator.-(10.5)}")
    println("\nStep 5: How to call a function using the operator style notation")
    println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")
  println(s"calling function ${donutCostCalculator.+++(10.5)}")
  }
}
