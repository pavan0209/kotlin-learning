// Single Inheritance

open class VehicleOwner(val name: String) {

    fun sayHello() = println("Hello, I'm $name")
}

class Driver(name: String, val vehicleNo: String) : VehicleOwner(name) {

    fun drive() = println("Driving $vehicleNo")
}

fun main() {

    val d = Driver("Tejas", "MH12NK0123")
    d.sayHello()
    d.drive()
}
