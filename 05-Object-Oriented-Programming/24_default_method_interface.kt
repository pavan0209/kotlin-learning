// Interface with Default Implementation

interface Camera {
    fun takePhoto()
    fun flashOn() {
        println("Flash turned on")
    }
}

class Smartphone : Camera {
    override fun takePhoto() = println("Photo taken by Smartphone")
}

fun main() {
    val phone = Smartphone()
    phone.takePhoto()
    phone.flashOn()  // uses default implementation
}