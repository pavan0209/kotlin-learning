// Primary + Secondary Constructor Combined

class Vehicle(val type: String) {
    var wheels : Int = 0

    constructor(type: String, wheels: Int) :this(type) {
        this.wheels = wheels
    }
}

fun main() {

    val v1 = Vehicle("Four Wheeler", 4)
    val v2 = Vehicle("Two Wheeler", 2)

    println("${v1.type} has ${v1.wheels}.")
    println("${v2.type} has ${v2.wheels}.")
}