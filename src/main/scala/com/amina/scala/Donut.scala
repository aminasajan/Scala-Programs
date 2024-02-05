package com.amina.scala

object Donut {
  class Donut(name: String,productCode:Long) {
    def print = println(s"Donut name=$name,productCode=$productCode")
  }
def main(args:Array[String]):Unit={
  val glazedDonut=new Donut("Glazed Donut",1111)
  val vanillaDonut = new Donut("Vanilla Donut", 2222)
glazedDonut.print
  vanillaDonut.print

 }




  }
