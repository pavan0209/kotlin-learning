// Lambda as Argument (Higher-Order Function)

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val result = operate(5, 3, operation = { x, y -> x + y })

    println("Result :: $result")
}
