
object flat {
  private var globalVariable: Int = 0

  def main(args: Array[String]): Unit = {
    // Call the secondFunction to get the value of localVariableSecond
    val result = secondFunction()
    // Now, you can access the value of localVariableSecond
    val localVariableSecondValue = result.localVariableSecond

    // Print or use localVariableSecondValue as needed
    println(s"Value of localVariableSecond in main: $localVariableSecondValue")
  }

  def secondFunction(): ResultObject = {
    // Local variable within secondFunction
    val localVariableSecond: String = "I am from secondFunction"

    // Use or manipulate localVariableSecond as needed

    // Return a ResultObject containing localVariableSecond
    ResultObject(localVariableSecond)
  }

  // Case class to hold the result of secondFunction
  case class ResultObject(localVariableSecond: String)
}
