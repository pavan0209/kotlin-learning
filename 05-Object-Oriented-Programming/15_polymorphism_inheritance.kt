// Polymorphism with Inheritance

open class Vehicles {
    open fun move() = println("Vehicles is moving")
}

class Bike : Vehicles() {
    override fun move() = println("Bike is riding on the road")
}

class Car : Vehicles() {
    override fun move() = println("Car is driving on the highway")
}

fun main() {
    Bike().move() // prints Bike moving
    Car().move() // prints Car moving
}
