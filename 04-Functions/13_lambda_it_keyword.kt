// Lambda with it keyword (single parameter)

val square: (Int) -> Int = { it * it }

fun main() {
    println("Square :: ${square(4)}")
}
