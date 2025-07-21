/*
    When (Switch Case) in Kotlin
*/

fun main() {

    val a = 4

    when (a) {
        1 -> println("a == 1")
        2 -> println("a == 2")
        else -> println("default case : a is neither 1 or 2")
    }

    val ans = when (a) {              // Store answer in variable ans for later use
                1 -> "a == 1"
                2 -> "a == 2"
                else -> "default case : a is neither 1 or 2"
            }

    println("$ans")
}
