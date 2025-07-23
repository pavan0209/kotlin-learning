// Secondary Constructor

class Employee {
    var name: String
    var age: Int

    constructor(name: String, age: Int) { // Secondary Constructor
        this.name = name
        this.age = age
    }
}

fun main() {
    val emp = Employee("Pavan", 23)
    println("Name: ${emp.name} \nAge: ${emp.age}")
}
