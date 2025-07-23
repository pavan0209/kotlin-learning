// Primary Constructor

class User(val name: String, val age: Int)      // Primary Contructor

fun main() {

    val userObject = User("Pavan", 23)          // object creation

    println("Name : ${userObject.name} \nAge : ${userObject.age}")    // accessing instance variables
}
