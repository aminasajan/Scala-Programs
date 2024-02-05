package com.amina.scala

object Type {
  def main(args:Array[String]):Unit={
//    1. Declare a variable of type Any

    println("Step 1: Declare a variable of type Any")
    val favoriteDonut: Any = "Glazed Donut"
    println(s"favoriteDonut of type Any = $favoriteDonut")


//2. Declare a variable of type AnyRef
    println("\nStep 2: Declare a variable of type AnyRef")
    val donutName: AnyRef = "Glazed Donut"
    println(s"donutName of type AnyRef = $donutName")

//    3. Declare a variable of type AnyVal
    println("\nStep 3: Declare a variable of type AnyVal")
    val donutPrice: AnyVal = 2.50
    println(s"donutPrice of type AnyVal = $donutPrice")

  }
}
//AnyVal types are typically represented as values in memory, directly containing their values.
//AnyRef types are represented as references to objects in memory. The reference points to the actual data stored elsewhere.
