package com.amina.scala

object Enum {
  def main(args:Array[String]):Unit={
//    1. How to create an Enumeration
    println("Step 1: How to create an enumeration")
    object Donut extends Enumeration {
      type Donut = Value

      val Glazed      = Value("Glazed")
      val Strawberry  = Value("Strawberry")
      val Plain       = Value("Plain")
      val Vanilla     = Value("Vanilla")
    }

    println("\nStep 2: How to print the String value of the enumeration")
    println(s"Vanilla Donut string value = ${Donut.Vanilla}")


    println("\nStep 3: How to print the id of the enumeration")
    println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")


    println("\nStep 4: How to print all the values listed in Enumeration")
    println(s"Donut types = ${Donut.values}")

    println("\nStep 5: How to pattern match on enumeration values")
    Donut.values.foreach {
      case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
      case _ => None

        println("\nStep 6: How to change the default ordering of enumeration values")
        object DonutTaste extends Enumeration{
          type DonutTaste = Value

          val Tasty       = Value(0, "Tasty")
          val VeryTasty   = Value(1, "Very Tasty")
          val Ok          = Value(-1, "Ok")
        }

        println(s"Donut taste values = ${DonutTaste.values}")
        println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")
    }

    // Define a new enumeration with a type alias and work with the full set of enumerated values
    object WeekDay extends Enumeration {
      type WeekDay = Value
      val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
    }
  import WeekDay._

    def isWorkingDay(d: WeekDay) = ! (d == Sat || d == Sun)

    WeekDay.values filter isWorkingDay foreach println
  }
//For example, without the import statement, you would need to write:
//  WeekDay.Mon
  //WeekDay.Tue
}
