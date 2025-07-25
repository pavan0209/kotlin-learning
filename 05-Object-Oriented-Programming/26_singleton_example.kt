// Real-Life Example: Logger Singleton

object Logger{
    fun logInfo(message: String) = println("INFO:: $message")
    fun logError(error: String) = println("ERROR:: $error")
}

fun main() {
    Logger.logInfo("Application started")
    Logger.logError("Something went wrong")

    println(Logger.hashCode())      // 1550089733
    println(Logger.hashCode())      // 1550089733
}