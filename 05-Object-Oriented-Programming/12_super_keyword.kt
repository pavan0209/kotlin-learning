// Super in Kotlin

open class Appliance(val name: String) {
    open fun start() = println("$name is starting...")
}

class SmartAppliance(name: String) : Appliance(name) {

    override fun start() {
        super.start()       // call to parent's start method
        println("$name is now connected to the Wi-Fi")
    }
}

fun main() {

    val s = SmartAppliance("Iphone")
    s.start()
}
