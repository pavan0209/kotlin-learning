// Init Block (with Primary Constructor)

class Student(val name: String, val rollNo: Int) {
    init {
        println("Student Details:: \nName: $name \nrollNo: $rollNo")

        println("\nStudent Details:: \nName: ${this.name} \nrollNo: ${this.rollNo}")
    }
}

fun main() {
    Student("Rushi", 21)
    println("\n")
    Student("Ganesh", 24)
}
