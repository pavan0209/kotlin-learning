// Default getter and setter

class Userr {
    var name: String = "Guest"
    var age: Int = 0
}

fun main() {

    val u = Userr()

    u.name = "Dipak"            // internally set(value) { field = value }
    u.age = 25

    println("Name: ${u.name}")  // internally => get() = field
    println("Age: ${u.age}")    
}