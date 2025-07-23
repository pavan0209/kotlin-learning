// Class in Kotlin

class Person {

    var name: String = ""       // Instance variables
    var age: Int = 0

    fun introduce() {           
        println("Hi, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person = Person()       // object creation
    person.name = "Pavan"
    person.age = 23
    person.introduce()          // call to member function
}
