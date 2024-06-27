
//If you want to print the values of the arrays without brackets, you can join the elements of the array into a single string
// using the joinToString() method.
//This method concatenates the elements of the array into a single string with a specified separator.




//fun main() {
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//    val names = arrayOf("John", "Jane", "Joe")
//
//    // Print the arrays without brackets
//    println(numbers.joinToString(", "))   // 1, 2, 3, 4, 5
//    println(names.joinToString(", "))     // John, Jane, Joe
//}



//The joinToString(", ") method call joins the elements of the array into a single string, separated by a comma and a space,
//without including any brackets.



// Using forEach:
//
//fun main() {
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//    val names = arrayOf("John", "Jane", "Joe")
//
//    // Print the numbers array vertically
//    numbers.forEach { println(it) }
//
//    println() // Add a blank line for separation
//
//    // Print the names array vertically
//    names.forEach { println(it) }
//}




// Using joinToString with a newline separator:    Print vertically

//fun main() {
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//    val names = arrayOf("John", "Jane", "Joe")
//
//    // Print the numbers array vertically
//    println(numbers.joinToString(separator = "\n"))
//
//    println() // Add a blank line for separation
//
//    // Print the names array vertically
//    println(names.joinToString(separator = "\n"))
//}
// Output:
// 1   John
// 2   Jane
// 3   Joe
// 4
// 5



//modification of the first element in the numbers array to 10,
//followed by printing the updated value,


fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // Modify the first element
    numbers[0] = 10

    // Print the modified element
    println(numbers[0]) // Output: 10
}