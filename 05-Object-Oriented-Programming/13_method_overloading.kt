// Method/Function overloading

class PaymentSystem {
    fun pay(amount: Double) {
        println("Paid $amount using cash")
    }

    fun pay(amount: Double, upiId: String) {
        println("Paid $amount via UPI ID: $upiId")
    }

    fun pay(amount: Double, cardNumber: Long, cvv: Int) {
        println("Paid $amount using card ending with ${cardNumber % 10000} and having cvv $cvv")
    }
}

fun main() {

    val paySystem = PaymentSystem()
    paySystem.pay(10000.80)
    paySystem.pay(20000.50, "pavan@ybl")
    paySystem.pay(30000.60, 1234_5678_9123, 234)
}
