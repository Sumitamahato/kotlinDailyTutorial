fun add(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun main() {
    println("Sum of 2 and 3 (Int): ${add(2, 3)}")
    println("Sum of 2.5 and 3.5 (Double): ${add(2.5, 3.5)}")
    println("Sum of 1, 2, and 3 (Int): ${add(1, 2, 3)}")
}



//Function overloading in Kotlin (or any programming language)
//refers to defining multiple functions with the same name but different parameters
//(different types or number of parameters).
//In this example, the add function is overloaded to handle different types and numbers of parameters.