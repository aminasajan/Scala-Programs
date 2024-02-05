package com.amina.scala

import scala.collection.immutable.BitSet

object MyBitSet {
  def main(args:Array[String]):Unit={
    val bitSet1: BitSet = BitSet(3, 2, 0)
    println(s"Elements of bitSet1 = $bitSet1")
    println(s"Element 0 = ${bitSet1(0)}")
    println(s"Element 2 = ${bitSet1(2)}")
    println(s"Element 3 = ${bitSet1(3)}")
    println("\nStep 3: How to add elements in BitSet using +")
    val bitSet2: BitSet = bitSet1 + 13 + 13
    println(s"Adding elements to BitSet using + = $bitSet2")
    val bitSet3: BitSet = bitSet1 ++ BitSet(13, 14, 15, 16, 17)
    println(s"Add two BitSets together using ++ = $bitSet3")
    println("\nStep 5: How to remove element in BitSet using -")
    val bitSet4: BitSet = bitSet1 - 0
    println(s"BitSet without element 0 = $bitSet4")

    println("\nStep 6: How to find the intersection between two BitSets using &")
    val bitSet5: BitSet = BitSet(0, 2, 4)
    println(s"Intersection of bitSet1 and bitSet5 = ${bitSet1 & bitSet5}")
    println("\nStep 7: How to find the difference between two BitSets using &~")
    println(s"Difference of bitSet1 and bitSet5 = ${bitSet1 &~ bitSet5}")
    println("\nStep 8: How to initialize an empty BitSet")
    val emptyBitSet: BitSet = BitSet.empty
    println(s"Empty BitSet = $emptyBitSet")


  }

}
