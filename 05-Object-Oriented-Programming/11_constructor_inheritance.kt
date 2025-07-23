// Constructor with Inheritance

open class Boook(val title: String, val author: String) {

    init {
        println("Book created: $title by $author")
    }
}

class EBook(title: String, author: String, val fileSize: Double) : Boook(title, author) {

    fun download() = println("Downloading $title with file size ($fileSize MB)")
}

fun main() {

    val eBook = EBook("C Programming", "Dennis Ritchie", 560.50)
    eBook.download()
}
