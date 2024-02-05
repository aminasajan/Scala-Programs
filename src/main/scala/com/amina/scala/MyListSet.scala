package com.amina.scala

import scala.collection.immutable.ListSet

object MyListSet {
  def main(args:Array[String]):Unit={

    println("Step 1: How to initialize an immutable ListSet with 3 elements")
    val listSet1: ListSet[String] = ListSet("Plain Donut","Strawberry Donut","Chocolate Donut")
    println(s"Elements of listSet1 = $listSet1")
    println("Step 1: How to initialize an immutable ListSet with 3 elements")
    val list1: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
    println(s"Elements of list1 = $list1")
    print(list1(0))
    println("\nStep 2: How to check elements of immutable ListSet")
    println(s"Element Plain Donut = ${listSet1("Plain Donut")}")
    println(s"Element Strawberry Donut = ${listSet1("Strawberry Donut")}")
    println(s"Element Chocolate Donut = ${listSet1("Chocolate Donut")}")
    println("\nStep 3: How to add elements of immutable ListSet using +")
    val listSet2: ListSet[String] = listSet1 + "Vanilla Donut"
    println(s"Adding element Vanilla to ListSet using + = $listSet2")
    println("\nStep 4: How to add two ListSet together using ++")
    val listSet3: ListSet[String] = listSet1 ++ ListSet("Glazed Donut")
    println(s"Add two lists together using ++ = $listSet3")
    println("\nStep 5: How to remove element from the ListSet using -")
    val listSet4: ListSet[String] = listSet1 - ("Plain Donut")
    println(s"ListSet without the element Plain Donut = $listSet4")
    println("\nStep 6: How to initialize an empty ListSet")
    val emptyListSet: ListSet[String] = ListSet.empty[String]
    println(s"Empty ListSet of type String = $emptyListSet")
  }

}
