package com.amina.scala
import scala.collection.immutable.ListMap
object MyListMap {
  def main(args: Array[String]): Unit = {
    val listMap1: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" -> "Strawberry Donut", "CD" -> "Chocolate Donut")
    println(listMap1)
    print(listMap1("PD"))
    println(s"Element by key SD = ${listMap1("SD")}")
    val listMap2: ListMap[String, String] = listMap1 + ("KD" -> "Krispy Kreme Donut")
    println(s"Elements of listMap2 = $listMap2")

    val listMap3: ListMap[String, String] = listMap1 ++ listMap2
    println(s"Elements of listMap3 = $listMap3")
    val listMap4: ListMap[String, String] = listMap1 - ("CD")
    println(s"ListMap without the key CD and its value = $listMap4")
    val emptyListMap: ListMap[String, String] = ListMap.empty[String,String]
    println(s"Empty ListMap with key type String and value also of type String= $emptyListMap")
  }
}
