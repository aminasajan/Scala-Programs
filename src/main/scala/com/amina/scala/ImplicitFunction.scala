//package com.amina.scala
//
//object ImplicitFunction {
//  class DonutString(s: String){
//    def isFavouriteDonut:Boolean =s=="Glazed Donut"
//  }
//}
//def main(args:Array[String]):Unit={
//  println("Step 1: How to create a wrapper String class which will extend the String type")
//
//  println("\nStep 4: How to create String values")
//  val glazedDonut = "Glazed Donut"
//  val vanillaDonut = "Vanilla Donut"
////  println("\nStep 5: How to access the custom String function called isFavaoriteDonut")
//  println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavouriteDonut}")
//  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavouriteDonut}")
//
//  println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")
//  class Donut{
//    implicit def stringToDonutString(s:String)=new DonutString(s)
//  }
//
//}
package com.amina.scala

object ImplicitFunction {
  // Step 1: Creating a wrapper String class
  class DonutString(s: String) {
    def isFavouriteDonut: Boolean = s == "Glazed Donut"
  }

  def main(args: Array[String]): Unit = {
    implicit def stringToDonutString(s: String): DonutString = new DonutString(s)

    println("Step 1: How to create a wrapper String class which will extend the String type")

    // Step 4: Creating String values
    val glazedDonut = "Glazed Donut"
    val vanillaDonut = "Vanilla Donut"

    // Step 5: Accessing the custom String function called isFavoriteDonut
    println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavouriteDonut}")
    println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavouriteDonut}")

    // Step 2: Creating an implicit function to convert a String to the wrapper String class

//     Using the implicit conversion
    val donut: String = "Glazed Donut"
    val isFavorite: Boolean = donut.isFavouriteDonut
    println(isFavorite)
  }
}
