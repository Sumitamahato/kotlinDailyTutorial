// A function with two int parameters Int Return Type

//fun sum(a:Int,b:Int):Int{
//    return a+b
//}

//  A function body can be an expression. Its return type is inferred.
// fun sum (a:Int, b:Int) = a+b
//
//
//fun main(){
//    println("sum of 3 and  5 is")
//    println(sum(3,5))
//}
//
//
//
//fun difference(a: Int, b: Int): Int {
//    return a - b
//}
//
//fun main() {
//    println("Difference of 10 and 3 is ${difference(10, 3)}")
//}
//
//
//
//fun product(a: Int, b: Int): Int {
//    return a * b
//}
//
//fun main() {
//    println("Product of 4 and 5 is ${product(4, 5)}")
//}
//
//
//
//
//fun product(a: Int, b: Int): Int {
//    return a * b
//}
//fun main() {
//    println("Product of 4 and 5 is ${product(4, 5)}")
//}
//
//
//
//fun quotient(a: Int, b: Int): Int {
//    return a / b
//}
//fun main() {
//    println("Quotient of 20 and 4 is ${quotient(20, 4)}")
//}
//
//
//
//
//fun remainder(a: Int, b: Int): Int {
//    return a % b
//}
//fun main() {
//    println("Remainder of 7 divided by 3 is ${remainder(7, 3)}")
//}
//
//
//
//
//fun square(a: Int): Int {
//    return a * a
//}
//
//fun main() {
//    println("Square of 6 is ${square(6)}")
//}
//
//
//
//fun square(a: Int): Int {
//    return a * a
//}
//
//fun main() {
//    println("Square of 6 is ${square(6)}")
//}
//
//
//
//
//fun cube(a: Int): Int {
//   return a * a * a
//}
//fun main() {
//   println("Cube of 3 is ${cube(3)}")
//}
//
//
//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}
//fun main() {
//    println("Max of 7 and 9 is ${max(7, 9)}")
//}
//
//
//
//fun min(a: Int, b: Int): Int {
//    return if (a < b) a else b
//}
//fun main() {
//    println("Min of 7 and 9 is ${min(7, 9)}")
//}
//
//
//
////
//fun power(a: Int, b: Int): Int {
//    return Math.pow(a.toDouble(), b.toDouble()).toInt()
//}
//fun main() {
//    println("2 to the power of 3 is ${power(2, 3)}")
//}
//
//
//fun absoluteValue(a: Int): Int {
//    return if (a < 0) -a else a
//}
//fun main() {
//    println("Absolute value of -5 is ${absoluteValue(-5)}")
//}


// You can write all the operations in a single function using an enumeration to specify the operation type.


enum class Operation {
    SUM, DIFFERENCE, PRODUCT, QUOTIENT, REMAINDER, SQUARE, CUBE, MAX, MIN, POWER, ABSOLUTE
}

fun performOperation(op: Operation, a: Int, b: Int = 0): Int {
    return when (op) {
        Operation.SUM -> a + b
        Operation.DIFFERENCE -> a - b
        Operation.PRODUCT -> a * b
        Operation.QUOTIENT -> a / b
        Operation.REMAINDER -> a % b
        Operation.SQUARE -> a * a
        Operation.CUBE -> a * a * a
        Operation.MAX -> if (a > b) a else b
        Operation.MIN -> if (a < b) a else b
        Operation.POWER -> Math.pow(a.toDouble(), b.toDouble()).toInt()
        Operation.ABSOLUTE -> if (a < 0) -a else a
    }
}

fun main() {
    println("Sum of 3 and 5 is ${performOperation(Operation.SUM, 3, 5)}")
    println("Difference of 10 and 3 is ${performOperation(Operation.DIFFERENCE, 10, 3)}")
    println("Product of 4 and 5 is ${performOperation(Operation.PRODUCT, 4, 5)}")
    println("Quotient of 20 and 4 is ${performOperation(Operation.QUOTIENT, 20, 4)}")
    println("Remainder of 7 divided by 3 is ${performOperation(Operation.REMAINDER, 7, 3)}")
    println("Square of 6 is ${performOperation(Operation.SQUARE, 6)}")
    println("Cube of 3 is ${performOperation(Operation.CUBE, 3)}")
    println("Max of 7 and 9 is ${performOperation(Operation.MAX, 7, 9)}")
    println("Min of 7 and 9 is ${performOperation(Operation.MIN, 7, 9)}")
    println("2 to the power of 3 is ${performOperation(Operation.POWER, 2, 3)}")
    println("Absolute value of -5 is ${performOperation(Operation.ABSOLUTE, -5)}")
}
