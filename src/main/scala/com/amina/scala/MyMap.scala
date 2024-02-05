package com.amina.scala

import scala.collection.immutable.SortedSet

object MyMap {
  def main(args:Array[String]):Unit={
   val map1:Map[String,String]=Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
    val map2: Map[String, String] = Map("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
    println(s"Elements of map1 = $map2")
    println(s"Element by key VD = ${map2("VD")}")
    println(s"Element by key GD = ${map2("GD")}")
    val map3: Map[String, String] = map1 + ("KD" -> "Krispy Kreme Donut")
    println(s"Element in map3 = $map3")
    println("\nStep 5: How to add two Maps together using ++")
    val map4: Map[String, String] = map1 ++ map2
    println(s"Elements in map4 = $map4")
    println("\nStep 6: How to remove key and its value from map using -")
    val map5: Map[String, String] = map4 - ("CD")
    println(s"Map without the key CD and its value = $map5")
    println("\nStep 7: How to initialize an empty Map")
    val emptyMap: Map[String,String] = Map.empty[String,String]
    println(s"Empty Map = $emptyMap")

   println("Step 1: How to initialize a Set with 3 elements")
   val set1: Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
   println(s"Elements of set1 = $set1")
   println("\nStep 6: How to find the intersection between two Sets using &")
   val set5: Set[String] = Set("Vanilla Donut", "Glazed Donut", "Plain Donut")
   println(s"Intersection of set1 and set5 = ${set1 & set5}")
   println(s"Difference between set1 and set5 = ${set1 &~ set5}")
   println("\nStep 8: How to initialize an empty Set")
   val emptySet: Set[String] = Set.empty[String]
   println(s"Empty Set = $emptySet")
//   val sortedSet6: SortedSet[String] = SortedSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(AlphabetOrdering)
//   println(s"Elements of sortedSet6 = $sortedSet6")
//   object AlphabetOrdering extends Ordering[String] {
//    def compare(element1:String, element2:String): Int = element2.compareTo(element1)
//   }
  }

}
//same goes for hashset,
//same format goes for hashmap, treemap, sequence, treeset
