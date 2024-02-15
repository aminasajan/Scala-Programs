# Scala-Programs

**import org.apache.spark.sql.SparkSession** - bring the SparkSession class from the Apache Spark SQL library into scope.
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
- 
**Companion Objects:** - A companion object is an object with the same name as a class and is defined in the same file.

**def main(args:Array[String]):Unit=** - The main method is a standard entry point for Scala applications.
- def: This keyword is used to define a method in Scala.
- main: This is the name of the method. In Scala, the main method is the entry point for running an application. It's where the execution of the program starts.
- (args: Array[String]): This part defines the method parameters. In this case, args is a parameter of type Array[String]. The Array[String] represents an array of strings, which typically contains command-line arguments passed to the program.
- : Unit: This part specifies the return type of the method. In Scala, Unit is similar to void in Java, indicating that the method doesn't return any value.

### Notes:
- It is not necessary that main function needs to be inside an object but inorder to run the main function, it should be inside an object. As the entry point is the main in the object.


