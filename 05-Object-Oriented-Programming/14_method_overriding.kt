// Method Overriding (runtime polymorphism)

open class Printer {
    open fun print() = println("Printing a document")
}

class PDFPrinter : Printer() {
    override fun print() = println("Printing a PDF document")
}

class ImagePrinter : Printer() {
    override fun print() = println("Printing an Image")
}

fun triggerPrint(p: Printer) {
    p.print()
}

fun main() {
    val pdf = PDFPrinter()
    val img = ImagePrinter()

    triggerPrint(pdf)
    triggerPrint(img)
}
