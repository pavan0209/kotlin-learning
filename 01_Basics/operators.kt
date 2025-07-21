/*
    Operators in Kotlin
*/

fun main() {

    val a = 10
    val b = 20

    // Arithmetic operators
    println(b + a)
    println(b - a)
    println(b * a)
    println(b / a)
    println(a % b)

    // Comparison operators
    println(a < b)
    println(a > b)
    println(a == b)
    println(a != b)

    // Logical Operators
    println(a == 10 || b == 20)
    println(a == 20 && b == 10)

    // identity operators
    val x: Any = 10
    val y: Any = 20
    println(x is Int)
    println(y !is String)

    // Assignment operators
    var m = 10
    val n = 20

    m += n
    m -= n
    m *= n
    m /= n

    println(m)
    println(n)
}
