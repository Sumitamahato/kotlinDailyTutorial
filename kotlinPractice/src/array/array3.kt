
// what is "it" function????
//it is a special implicit name for the single parameter in a lambda expression.
//When a lambda expression has only one parameter, you can refer to it as it instead of explicitly declaring
//the parameter name.
//
//
//
//Here are some examples to illustrate how it is used in lambda expressions:

//Example 1: Printing Each Element of an Array
//Using the forEach function with a lambda expression:



//fun main() {
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//
//    // Using 'it' to refer to the single parameter in the lambda expression
//    numbers.forEach { println(it) }
//}


// In this example, it represents each element of the numbers array as the forEach function iterates over the array.



// Example 2: Filtering Elements in a List
// Using the filter function with a lambda expression: where 'it' to refer to the single parameter in the lambda expression
//
//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val evenNumbers = numbers.filter { it % 2 == 0 }
//    println(evenNumbers) // Output: [2, 4]
//}




// Example 3: Mapping Elements in a List

// Using the map function with a lambda expression:


// fun main() {
//    val names = listOf("John", "Jane", "Joe")
//
//    // Using 'it' to refer to the single parameter in the lambda expression
//    val upperCaseNames = names.map { it.uppercase() }
//    println(upperCaseNames) // Output: [JOHN, JANE, JOE]
//}