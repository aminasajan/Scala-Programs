package com.amina.scala

object ForLoop {
  def main(args:Array[String]):Unit={
// 1. A simple for loop from 1 to 5 inclusive
    println("Step 1: A simple for loop from 1 to 5 inclusive")
for (n<- 1 to 5)
  {
    print(s"$n ")
  }
    println(" ")


    //2. A simple for loop from 1 to 5, where 5 is NOT inclusive
    println("\nStep 2: A simple for loop from 1 to 5, where 5 is NOT inclusive")
    for (n<- 1 until 5)
    {
      print(s"$n ")
    }
    print("\n")


    //3.Filter values using if conditions in for loop
    println("\nStep 3: Filter values using if conditions in for loop")
    val n= List("Flour","Maida","Sugar","Egg")
    for(i <- n if i=="Maida"){
      println(s"$i found")
    }


    //4. Filter values using if conditions in for loop and return the result back using the yield keyword
    println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
    val j= for{
      i<- n
      if(i =="Sugar" || i=="Maida")
    } yield i
    print(j)
    print("\n")


    //5. Using for comprehension to loop through 2-Dimensional array
    println("\nStep 5: Using for comprehension to loop through 2-Dimensional array")
    val a=Array.ofDim[String](2,2)
    a(0)(0)="flour"
    a(0)(1)="sugar"
    a(1)(0)="egg"
    a(1)(1)="syrup"
for{ x<-0 until 2
     y<-0 until 2}
  print(s"${a(x)(y)}\n")

  }
}


