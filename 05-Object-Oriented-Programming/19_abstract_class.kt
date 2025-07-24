// Abstract classes in Kotlin

abstract class Animals {
    abstract fun makeSound()

    fun eat() {
        println("Eating food")
    }
}

fun main() {

    val a = Animals()       //  error: cannot create an instance of an abstract class.
}
