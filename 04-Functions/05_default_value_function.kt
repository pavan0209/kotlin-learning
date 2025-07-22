// Function with default values

fun add(a: Int, b: Int = 0, c: Int = 0): Int {
    return a + b + c
}

fun main() {

    var result = add(10)
    println("Addition :: $result")

    result = add(10, 20)
    println("Addition :: $result")

    result = add(10, 20, 30)
    println("Addition :: $result")
}
