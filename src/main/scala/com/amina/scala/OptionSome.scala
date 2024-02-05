package com.amina.scala

object OptionSome {
  def main(args:Array[String]):Unit={
//    1. How to use Option and Some - a basic example
    println("Step 1: How to use Option and Some - a basic example")
    val v: Option[String]=Some("Very Tasty")
    println(s"Taste = ${v.get}")

//    2. How to use Option and None - a basic example
    println("\nStep 2: How to use Option and None - a basic example")
    val q:Option[String]=None
    println(s"Taste = ${q.getOrElse("Tasty")}")

//    3. How to use Pattern Matching with Option
    println("\nStep 3: How to use Pattern Matching with Option")
    v match{
      case Some(name)=>println(s"Received donut name = $name")
      case None       => println(s"No donut name was found!")
    }
  }

}
//Functional programming encourages the use of immutable data structures, meaning that once a value is assigned, it does not change.
//