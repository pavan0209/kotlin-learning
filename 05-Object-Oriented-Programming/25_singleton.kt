//  Singleton in Kotlin

object Database {
    fun connect() = println("Connected to database")
}

fun main() {

    Database.connect()

    println(Database.connect().hashCode())
    println(Database.connect().hashCode())
}