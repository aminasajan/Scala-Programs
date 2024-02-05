package com.amina.scala
import scala.collection.immutable.Queue
object MyQueue {
  def main(args:Array[String]):Unit={
    val queue1:Queue[String]=Queue("Plain Donut","Strawberry Donut","Chocolate Donut")
    print(queue1)
    println(s"Element at index 0 = ${queue1(0)}")
    println(s"Element at index 0 = ${queue1(1)}")
    println(s"Element at index 0 = ${queue1(2)}")
    val queue2: Queue[String] = queue1 :+ "Glazed Donut"
    println(s"Elements of queue2 = $queue2")
    val enquue: Queue[String] = queue1.enqueue("Vanilla Donut")
    println(s"Enqueue element Vanilla Donut onto queue1 = $enquue")
    val dequeue: (String, Queue[String]) = queue1.dequeue
    println(s"First element dequeue = ${dequeue._1}")
    println(s"Remaining elements after dequeue = ${dequeue._2}")
    val queue3: Queue[String] = queue1 ++ Queue[String]("Glazed Donut", "Vanilla Donut")
    println(s"Elements in queue3 = $queue3")
    val emptyQueue: Queue[String] = Queue.empty[String]
    println(s"Empty Queue = $emptyQueue")
  }

}
