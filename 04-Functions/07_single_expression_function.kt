// Single-expression functions

fun square(num: Int): Int = num * num

fun add(num1: Int, num2: Int): Int = num1 + num2

fun main() {

    val result = square(4)
    println("Square :: $result")

    println("Addition :: ${add(5,5)}")
}
