// Interfaces in Kotlin

interface Watch {

    fun start()
    fun stop()
}

fun main() {

    // Watch().start() // error: interface 'interface Watch : Any' does not have constructors.
}
