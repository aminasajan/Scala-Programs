package com.amina.scala

object PatternMatching {
def main(args:Array[String]):Unit={
//  Similar to Switch

//  1. Pattern matching
  var i="Glazed Donut"
  i match{
    case "Glazed Donut"=>println("Very Tasty")
    case "Plain Donut"=>println("Tasty")
  }

// 2. Pattern matching and return the result
  println("\nStep 2: Pattern matching and return the result")
  var j=i match{
    case "Glazed Donut"=>"Very Tasty"
    case "Plain Donut"=>("Tasty")
  }
  println(s"Taste level of $i is $j")

//  3. Pattern matching using the wildcard operator
  println("\nStep 3: Pattern matching using the wildcard operator")
  j=i match{
    case "Glazed Donut"=>"Very Tasty"
    case "Plain Donut"=>("Tasty")
    case _=>"Tasty"
  }
  println(s"Taste level of $i is $j")

//  4. Pattern matching with two or more items on the same condition
  println("\nStep 4: Pattern matching with two or more items on the same condition")
  j=i match{
    case "Glazed Donut"| "Strawberry Donut" =>"Very Tasty"
    case "Plain Donut"=>("Tasty")
    case _=>"Tasty"
  }
  println(s"Taste level of $i is $j")

//  5. Pattern matching and using if expressions in the case clause
  println("\nStep 5; Pattern matching and using if expressions in the case clause")
  j= i match{
    case y if (y.contains("Glazed")||y.contains("Strawberry"))=>"Very Tasty"
    case "Plain Donut"  => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $i is $j")

//  6. Pattern matching by types
  println("\nStep 6: Pattern matching by types")
  val priceOfDonut: Any = 2.50
  val priceType = priceOfDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }
  println(s"Donut price type = $priceType")
}
}
