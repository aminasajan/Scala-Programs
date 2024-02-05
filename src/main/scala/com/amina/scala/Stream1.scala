package com.amina.scala

import scala.#::
import scala.collection.immutable.Stream.cons

object Stream1 {
  def main(args:Array[String]):Unit={
    val stream1:Stream[Int]=1 #:: 2 #:: 3 #:: Stream.empty
println(stream1)
    val stream2:Stream[Int]=cons(1,cons(2,cons(3,Stream.empty)))
    println(stream2)
    stream2.take(10).print()
    println()
    def infiniteNumberStream(number:Int):Stream[Int]=Stream.cons(number,infiniteNumberStream(number+1))
  infiniteNumberStream(1).take(20).print()
    println()
    val stream3:Stream[Int]=Stream.from(1)
    stream3.take(20).print()
    println()
    val emptyStream:Stream[Int]=Stream.empty[Int]
    println(emptyStream)
  }

}
