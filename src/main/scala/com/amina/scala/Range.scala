package com.amina.scala

object Range {
def main(args:Array[String]):Unit={
//1. Create a simple numeric range from 1 to 5 inclusive
  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val i= 1 to 5
  print(i)
  println()


//2. Create a numeric range from 1 to 5 but excluding the last integer number 5
  println("\nStep 2: Create a numeric range from 1 to 5 but excluding the last integer number 5")
  val j =1 until 5
  print(j)
  println()


//  3. Create a numeric range from 0 to 10 but increment with multiples of 2
  println("\nStep 3: Create a numeric range from 0 to 10 but increment with multiples of 2")
  val k= 0 to 10 by 2
  print(k)
  println()


//4. Create an alphabetical range to represent letter a to z
  println("\nStep 4: Create an alphabetical range to represent letter a to z")
  val a= 'a' to'z'
  print(a)
  println()

//5. Character ranges with user specified increment
  println(s"\nStep 5: Character ranges with user specified increment")
  val b= 'a' to'z' by 2
  print(b)
  println()

//  6. Convert the Scala Range into collections
  println("\nStep 6: Storing our ranges into collections")
  val q= (1 to 5).toList
  println(s"Range to List = ${q.mkString(" ")}")
  println(s"Range to List = ${q}")
  println()

  val w=(1 to 5).toSet
  println(s"Range to Set= ${w.mkString(" ")}")
  println()

  val e=(1 to 5).toSeq
  println(s"Range to sequence =${e.mkString(" ")}")
  println()

  val r=(1 to 5 ).toArray
  println(s"Range to array= ${r.mkString(" ")}")



}
}
