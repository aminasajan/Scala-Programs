package com.amina.scala

object While_doWhile {
def main(args:Array[String]):Unit={
//  1. How to use while loop in Scala
  println("Step 1: How to use while loop in Scala")
  var i=10
  while(i>0){
    println(i)
    i-=1
  }

//  2. How to use do while loop in Scala
  println("\nStep 2: How to use do while loop in Scala")
  i=9
  do{
    println(i)
    i-=1
  }while(i>0)
}
}
