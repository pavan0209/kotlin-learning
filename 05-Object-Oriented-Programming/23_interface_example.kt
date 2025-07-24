// Interface Example

interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start() = println("Car started")
    override fun stop() = println("Car stopped")
}

class Bike : Vehicle {
    override fun start() = println("Bike started")
    override fun stop() = println("Bike stopped")
}

fun main() {
    val v1: Vehicle = Car()
    val v2: Vehicle = Bike()
    
    v1.start()
    v2.start()
}
