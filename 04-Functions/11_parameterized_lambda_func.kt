// Lambda function with parameters

val add = { num1: Int, num2: Int -> num1 + num2 }

fun main() {

    println("Addition :: ${add(10, 20)}")
}
