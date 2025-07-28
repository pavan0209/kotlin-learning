// Factory Design Pattern in Kotlin

interface PaymentMethod {
    fun pay(amount: Double)
}

class UpiPayment : PaymentMethod {

    override fun pay(amount: Double) {
        println("Paid $amount using Upi")
    }
}

class CreditCardPayment : PaymentMethod {

    override fun pay(amount: Double) {
        println("Paid $amount using credit card")
    }
}

class PaypalPayment : PaymentMethod {

    override fun pay(amount: Double) {
        println("Paid $amount using paypal")
    }
}

class PaymentFactory {

    companion object {
        fun getPaymentMethod(type: String): PaymentMethod {
            return when (type.lowercase()) {
                "upi" -> UpiPayment()
                "card" -> CreditCardPayment()
                "paypal" -> PaypalPayment()
                else -> throw IllegalArgumentException("Unsupported payment type")
            }
        }
    }
}

fun main() {
    val selectedPayment = PaymentFactory.getPaymentMethod("card")
    selectedPayment.pay(999.0)

    val secondPayment = PaymentFactory.getPaymentMethod("upi")
    secondPayment.pay(299.0)
}
