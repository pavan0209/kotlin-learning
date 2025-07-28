// Data Class 

data class Students(
    val rollNo: Int,
    val name: String,
    val grade: String
)

fun main() {
    val student1 = Students(1, "Amol", "A")
    val student2 = Students(1, "Amol", "A")

    println(student1)                    // toString
    println(student1 == student2)       // equals
    println(student1.hashCode())        // hashCode

    val updated = student1.copy(grade = "A+")
    println(updated)

    val (roll, name, grade) = student1  // Destructuring
    println("Roll: $roll, Name: $name, Grade: $grade")
}
