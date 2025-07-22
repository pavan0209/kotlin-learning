// Function with parameters and return value

fun add(num1: Int?, num2: Int?): Int? {
    return if (num1 != null && num2 != null) {
        num1 + num2
    } else {
        null
    }
}

fun main() {

    print("Enter num1 :: ")
    val num1 = readLine()?.toIntOrNull()
    print("Enter num2 :: ")
    val num2 = readLine()?.toIntOrNull()

    val result = add(num1, num2)

    if (result == null) {
        println("Invalid Input!, please enter valid numbers")
    } else {
        println("Addition of $num1 + $num2 = $result")
    }
}
