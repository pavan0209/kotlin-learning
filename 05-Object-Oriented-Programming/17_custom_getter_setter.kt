// Custom Getter and Setter

class Temperature {
    var celcius: Double = 0.0
        set(value) {
            println("Setting temperature to $value C")
            field = value
        }

    val fahrenheit: Double
        get() = (celcius * 9 / 5) + 32
}

fun main() {
    val temp = Temperature()
    temp.celcius = 30.5     // setter

    println("Fahrenheit: ${temp.fahrenheit}")   // getter
}
