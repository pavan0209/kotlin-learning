// Encapsulation in Kotlin

class Student {
    private var marks: Int = 0    // only accessible inside the class

    fun setMarks(value: Int) {
        if (value in 0..100) {
            marks = value
        } else {
            println("Invalid marks! Must be between 0 and 100.")
        }
    }

    fun getMarks() : Int = marks
}

fun main() {
    val s = Student()
    s.setMarks(85)
    println("Student marks: ${s.getMarks()}")

    s.setMarks(120)  // invalid
    println("Student marks: ${s.getMarks()}")
}