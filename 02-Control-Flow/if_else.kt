// if-else statement

fun main() {

    val a = 30
    val b = 30

    if (a < b) {
        println("$a is less than $b")
    } else {
        println("$a is greater than $b")
    }

    var max = if (a > b) a else b
    println("Max :: $max")

    // if-else ladder
    if (a < b) {
        println("$a is less than $b")
    } else if (a > b) {
        println("$a is greater than $b")
    } else {
        println("Both are equal")
    }

    
    val maxNum =
            if (a > b) {
                println("choose a")
                a
            } else {
                println("choose b")
                b
            }

    println("Maxx : $maxNum")
}
