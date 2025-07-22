// Outer Function and Inner Function

fun outerFunction(): () -> Unit {
    val message = "Hello from outer function"
    println(message)

    fun innerFunction() {
        println("Hello from inner function")
    }

    // innerFunction()
    return ::innerFunction // returns inner class reference
}

fun main() {

    println("Hello from main function")

    val func = outerFunction()
    func() // inner class reference -> calls to direct inner function from outside of outer function
    println(func::class)
}
