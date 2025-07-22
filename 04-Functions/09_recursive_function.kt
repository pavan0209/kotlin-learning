// Recursion in Kotlin

fun factorial(num: Int): Int {

    if (num <= 1) return num

    return num * factorial(num - 1)     // tail recursive function
}

fun main() {

    val result = factorial(num = 5)

    println("Factorial :: $result")
}
