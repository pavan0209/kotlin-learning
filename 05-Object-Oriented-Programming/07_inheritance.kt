// Inheritance

open class Animal {

    init {
        println("In Animal init block")
    }

    fun eat() {
        println("Eating food")
    }
}

class Dog : Animal() {

    init {
        println("In Dog init block")
    }

    fun bark() {
        println("Barking")
    }
}

fun main() {
    val dog = Dog()
    dog.eat()           // Inherited from Animal class
    dog.bark()          // Defined in Dog class
}
