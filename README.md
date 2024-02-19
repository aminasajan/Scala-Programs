# Scala-Programs

```import org.apache.spark.sql.SparkSession``` - bring the SparkSession class from the Apache Spark SQL library into scope.
- org: This is the top-level package name. Packages provide a way to group related classes and other entities together.
- apache: This is a sub-package under the org package. It represents the Apache Software Foundation, which is the organization responsible for the Apache Spark project.
- spark: This is another sub-package under the apache package. It specifically pertains to the Apache Spark project, which is a distributed computing framework for big data processing.
- sql: This is a sub-package under the spark package. It contains classes related to Spark SQL, which is a component of Apache Spark for working with structured data.
- SparkSession: This is the class being imported. SparkSession is the entry point to Spark SQL functionality. It allows you to create DataFrames, execute SQL queries, and perform various data processing tasks in Spark SQL.

**object** - used to create a singleton object, which encapsulates the Scala code within it. 
- In Scala, the main method, which serves as the entry point for executing the program, must be defined inside an object. 
- This ensures that there is a well-defined starting point for the program execution. When the Scala program is run, the main method defined inside the object will be executed.
- You can access the methods and variables defined in an object from anywhere in your program without the need to instantiate the object.
- Objects in Scala are lazily initialized and have only one instance throughout the program's execution.
 
**Companion Objects:** - A companion object is an object with the same name as a class and is defined in the same file.

```
def main(args:Array[String]):Unit={}
```
 - The main method is a standard entry point for Scala applications.
- def: This keyword is used to define a method in Scala.
- main: This is the name of the method. In Scala, the main method is the entry point for running an application. It's where the execution of the program starts.
- (args: Array[String]): This part defines the method parameters. In this case, args is a parameter of type Array[String]. The Array[String] represents an array of strings, which typically contains command-line arguments passed to the program.
- : Unit: This part specifies the return type of the method. In Scala, Unit is similar to void in Java, indicating that the method doesn't return any value.

```
Logger.getLogger("org").setLevel(Level.ERROR)
```
- The purpose of this line of code is to configure the logger named "org" to only log messages of severity level ERROR or higher.
- By setting the logging level to ERROR, less critical log messages are suppressed, resulting in cleaner and more focused log output.
### Notes:
- It is not necessary that main function needs to be inside an object but inorder to run the main function, it should be inside an object. As the entry point is the main in the object.
- To display whole rows of a dataset, use **csvDF.show(Int.MaxValue)**
  




# Implicit
## Implicit Parameters: 
When a method with implicit parameters is called, the compiler searches for values of the appropriate types in the current scope and fills in the implicit parameters automatically.
 ```
package com.example

import org.apache.log4j.{Level, Logger}

object justImplicit {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    def greet(name: String)(implicit greeting: String): Unit = {
      println(s"$greeting, $name!")
    }

    implicit val helloGreeting: String = "Hello"
    implicit val holaGreeting=2

    greet("John") // Compiler automatically selects the appropriate greeting

  }
}
```
## Implicit Conversions:
Implicit conversions enable automatic conversion between different types. 
```
case class Celsius(value: Double)
case class Fahrenheit(value: Double)

implicit def celsiusToFahrenheit(c: Celsius): Fahrenheit = {
  Fahrenheit(c.value * 9 / 5 + 32)
}

val temperatureC: Celsius = Celsius(25)
val temperatureF: Fahrenheit = temperatureC // Implicit conversion happens here
```
In this example, an implicit conversion from Celsius to Fahrenheit is defined. When assigning a Celsius value to a Fahrenheit variable, the compiler automatically applies the conversion.
## Implicit Classes:
Implicit classes allow you to add new methods to existing classes without modifying their source code. 
```
implicit class IntExtensions(value: Int) {
  def squared: Int = value * value
}

val num: Int = 5
val squaredNum: Int = num.squared // Using the implicit method
```
### Notes:
Implicit classes are typically used to add methods or behavior to existing types through implicit conversions.

## Type Classes
Type classes provide a mechanism for defining generic interfaces and behaviors that can be implemented by any data type.
```
trait Show[A] {
  def show(a: A): String
}

implicit val intShow: Show[Int] = new Show[Int] {
  def show(a: Int): String = a.toString
}

def printValue[A](value: A)(implicit ev: Show[A]): Unit = {
  println(ev.show(value))
}

printValue(42) // Output: 42
```


