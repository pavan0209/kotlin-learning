// User Input in Kotlin

fun main() {

    // taking string input
    print("Enter your name :: ")
    val name = readLine()
    println("Hello, $name")

    // taking integer values from user
    print("Enter your age :: ")
    val age: Int? = readLine()?.toIntOrNull()

    if (age != null) {
        println("You are $age years old.")
    } else {
        println("Invalid input!!")
    }

    // taking Float values from user
    print("Enter your salary :: ")
    val salary: Float? = readLine()?.toFloatOrNull()

    if (salary != null) {
        println("Your salary is $salary.")
    } else {
        println("Invalid input!!")
    }

    // Taking character input
    print("Enter your wing :: ")
    val wing: Char? = readLine()?.firstOrNull()

    println("You are living in wing $wing")
}
