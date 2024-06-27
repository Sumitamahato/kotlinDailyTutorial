

// What is an array?
//An array in Kotlin is a collection of elements of the same type.
// Arrays are a fundamental data structure used to store multiple values in a single variable.
// Kotlin provides a powerful array implementation that is both easy to use and highly functional.




//Basic Syntax
//You can declare an array in Kotlin using the arrayOf function or using specialized array classes like IntArray, DoubleArray, etc.




// Using arrayOf Function
//fun main() {
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//    val names = arrayOf("John", "Jane", "Joe")
//
//    // Print the arrays in a human-readable format
//    println(numbers.contentToString())
//    println(names.contentToString())
// }





// Using Specialized Array Classes
//fun main() {
//   val intArray = intArrayOf(1, 2, 3, 4, 5)
//  val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)
//
//
//    println(intArray.contentToString())
//    println(doubleArray.contentToString())
//}



// Accessing Elements
// You can access elements of an array using the index operator [].


fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val names = arrayOf("John", "Jane", "Joe")

    val firstNumber = numbers[0] // Assigns 1 to firstNumber
    val secondName = names[1]    // Assigns "Jane" to secondName

    // Printing the assigned values
    println("First number: $firstNumber")
    println("Second name: $secondName")
}



// Modifying Elements
//You can modify elements in an array by assigning new values to specific indices.

// numbers[0] = 10
// println(numbers[0]) // 10
//

