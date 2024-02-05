package com.amina.scala

object HigherOrderFunc {
def main(args:Array[String]):Unit= {
  def operateOnNumbers(a:Int,b:Int,operation:(Int,Int)=>Int):Int={
    operation(a,b)
  }
  val s=operateOnNumbers(3,5,(x,y)=>x+y)
  val j=operateOnNumbers(3,5,(x,y)=>x*y)
  println(s)
  println(j)
}
}
