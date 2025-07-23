// Default Parameter Constructor (Recommended Kotlin Way)

class Book(val title: String = "Unknown", val pages: Int = 0)

fun main() {

    val b1 = Book()
    val b2 = Book("Geeta", 560)

    println("The book ${b1.title} has ${b1.pages} pages.")
    println("The book ${b2.title} has ${b2.pages} pages.")
}
