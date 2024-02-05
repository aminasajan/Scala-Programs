package com.amina.scala

object abstractClass {
  def main(args: Array[String]): Unit = {
    abstract class Donut(name: String) {
      def printName: Unit
    }//Abstract classes can't be instantiated directly.

    class VanillaDonut(name: String) extends Donut(name) {
      override def printName: Unit = println(name)
    }
    object VanillaDonut {
      def apply(name: String) = {
        new VanillaDonut(name)
      }
    }
    class GlazedDonut(name: String) extends Donut(name) {

      override def printName: Unit = println(name)

    }

    object GlazedDonut {

      def apply(name: String): Donut = {
        new GlazedDonut(name)
      }
    }
    val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
    vanillaDonut.printName

    val glazedDonut: Donut = GlazedDonut("Glazed Donut")
    glazedDonut.printName
  }
}
