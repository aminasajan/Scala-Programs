package com.amina.scala

object DonutShoppingCartDao {
  def main(args: Array[String]): Unit = {
    trait DonutShoppingCartDao {
      def add(donutName: String): Long

      def update(donutName: String): Boolean

      def search(donutName: String): String

      def delete(donutName: String): Boolean
    }
    class DonutShoppingCart extends DonutShoppingCartDao {
      override def add(donutName: String): Long = {
        println(s"DonutShoppingCart-> add method -> donutName: $donutName")
        1
      }

      override def delete(donutName: String): Boolean = {
        println(s"DonutShoppingCart-> delete method -> donutName: $donutName")
        true
      }

      override def update(donutName: String): Boolean = {
        println(s"DonutShoppingCart-> update method -> donutName: $donutName")
        true
      }

      override def search(donutName: String): String = {
        println(s"DonutShoppingCart-> search method -> donutName: $donutName")
        donutName
      }
      }
    val donutShoppingCart:DonutShoppingCart=new DonutShoppingCart()
      donutShoppingCart.add("Vanilla Donut")
    donutShoppingCart.update("Vanilla Donut")
    donutShoppingCart.search("Vanilla Donut")
    donutShoppingCart.delete("Vanilla Donut")

    val donutShoppingCart2: DonutShoppingCartDao = new DonutShoppingCart()
    donutShoppingCart2.add("Vanilla Donut")
    donutShoppingCart2.update("Vanilla Donut")
    donutShoppingCart2.search("Vanilla Donut")
    donutShoppingCart2.delete("Vanilla Donut")
  }


}