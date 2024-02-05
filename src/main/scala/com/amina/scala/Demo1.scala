package com.amina.scala

object Demo1 {
def main(args:Array[String]):Unit= {
  val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")

  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
  } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")
}
}
