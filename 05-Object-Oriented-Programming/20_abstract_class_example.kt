// Abstract class example

abstract class Vehical(val brand: String) {

    abstract fun start()

    fun stop() {
        println("$brand vehicle has stopped.")
    }
}

class Bikes(brand: String) : Vehical(brand) {

    override fun start() {
        println("$brand bike is starting with a kick.")
    }
}

class Cars(brand: String) : Vehical(brand) {

    override fun start() {
        println("$brand car is starting with a key.")
    }
}

fun main() {

    val bike: Vehical = Bikes("Kawasaki")
    bike.start()
    bike.stop()

    val car: Vehical = Cars("Bugati")
    car.start()
    car.stop()
}
