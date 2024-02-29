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
  ## Initializing Spark
  
```
  val spark = SparkSession.builder()
      .appName("MySparkApp")
      .master("local[*]")
      .getOrCreate()
```



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

# Modularization
Modularization involves organizing code into reusable and logically isolated units.
## Benefits
- Reusability:
  Modularization promotes code reuse by encapsulating common functionality into separate modules.
- Maintainability:
  developers can isolate changes and updates to specific parts of the codebase.
- Scalability:
  modular design principles allow for seamless integration of new features and enhancements.
- Collaboration:
  Modularization encourages collaboration among team members by providing clear boundaries and interfaces between different components of the Spark application.
  ## Organizing Modules
  1. Grouping Related Functionality into Separate Modules:
  - Identify cohesive sets of functionality within your Spark application that can be encapsulated into distinct modules.
 - For example, you might have modules for data ingestion, data processing, data analysis, and data visualization.
  2. Defining Module Dependencies in sbt:
- Module dependencies specify the relationships between different modules in your Spark project.
- Declare dependencies in the build.sbt file using the *libraryDependencies* key.
- Specify dependencies using the group ID, artifact ID, and version of the external library or module.
- Organize dependencies into logical groups based on their purpose or functionality within the project.
3. Creating Separate Packages for Distinct Modules:
- Packages provide a way to organize code into hierarchical namespaces.
- Create separate packages for each distinct module in your Spark project.
- For example, you might have packages like com.example.spark.ingestion, com.example.spark.processing, etc.
4.Resolving Conflicts and Versioning Issues:
- Dependency conflicts can arise when multiple modules depend on different versions of the same library or module.
- Use sbt's dependency resolution mechanism to resolve conflicts automatically.
- Specify version ranges for dependencies to allow sbt to choose compatible versions at build time.
- Manually override dependency versions if necessary, but exercise caution to avoid compatibility issues.

## Testing Modular Components
 1. Writing Unit Tests for Modular Spark Components:
- Unit tests focus on testing individual units or modules of your Spark application in isolation.
- Write unit tests using a testing framework such as ScalaTest, JUnit, or another preferred testing library.
- Ensure that unit tests cover both positive and negative scenarios, including edge cases and error conditions.
2. Setting Up Testing Frameworks (e.g., ScalaTest, JUnit):
- Set up the testing environment by configuring the build tool (e.g., sbt) to include the testing framework as a dependency.
- Create test classes and define test methods to encapsulate individual test cases for your Spark components.
3. Mocking Dependencies and External Resources for Testing:
- External dependencies, such as database connections, file systems, or external services, can introduce complexity and variability in unit tests.
- Use mocking frameworks like Mockito or ScalaMock to simulate the behavior of external dependencies and isolate the unit under test.
- Mock external resources by defining mock objects or stubs that mimic the expected behavior of the real dependencies.
- Inject mock dependencies into the unit being tested to control its interactions with external resources and ensure deterministic test outcomes.

  ## Documenting Your Code
- ScalaDoc is a documentation tool for Scala projects that generates HTML documentation from inline comments in the source code.
- Use ScalaDoc syntax to annotate functions, classes, traits, and objects with descriptive comments that explain their purpose, inputs, outputs, and usage.
