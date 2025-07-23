// Hierarchical Inheritance

open class Device(val brand: String) {
    fun powerOn() = println("$brand device is on now.")
}

class Mobile(brand: String, val simCount: Int) : Device(brand) {
    fun makeCall() = println("Making a call using $simCount SIMs")
}

class Laptop(brand: String, val ram: Int) : Device(brand) {
    fun code() = println("Coding with $ram GB RAM")
}

fun main() {

    val m = Mobile("Samsung", 2)
    val l = Laptop("Lenovo", 8)

    m.powerOn()
    m.makeCall()

    l.powerOn()
    l.code()
}
