package com.amina.scala

object Tuples {
  def main(args:Array[String]):Unit={

//    1. Using Tuple2 to store 2 data points
    println("Step 1: Using Tuple2 to store 2 data points")
val i= Tuple2("Glazed Donut", "Very Tasty")
    println(i)

//    2. Access each element in tuple
    println("\nStep 2: Access each element in tuple")
    val q=i._1
    val t=i._2
    println(s"$q \n$t")

//   3. Using TupleN classes to store more than 2 data points
    println("\nStep 3: Using TupleN classes to store more than 2 data points")
    val b= Tuple3("Glazed Donut", "Very Tasty", 2.50)
    println(s"${b._1} taste level is ${b._2} and price is ${b._3} ")

// 4.How to use pattern matching on Tuples
    println("\nStep 4: How to use pattern matching on Tuples")
    val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
    val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
    val donutList = List(strawberryDonut, plainDonut)
    val r=donutList.foreach {tuple=>{
      tuple match {
        case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
        case d if d._1 == "glazedDonut" => println(s"Donut type = ${d._1}, price = ${d._3}")
        case _ => None
      }
    }
    }

    //5. Shortcut for creating Tuples
    println("\nStep 5: Shortcut for creating Tuples")
    val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0)
print(chocolateDonut)
  }

}



