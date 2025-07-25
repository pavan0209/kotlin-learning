// Companion Object

class MathUtils {
    companion object {      // works same as static in other languages
        fun square(x: Int): Int {
            return x * x
        }
    }
}

fun main() {
    println(MathUtils.square(10))
}
