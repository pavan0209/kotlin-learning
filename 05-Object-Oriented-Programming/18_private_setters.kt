// Private Setters (Immutable from outside)

class BankAccount(val accountHolder: String) {
    var accountNumber: String = "ACC0001"
        private set

    fun updateAccountNumber(newAccountNumber: String) {
        accountNumber = newAccountNumber
    }
}

fun main() {
    val acc = BankAccount("Dipak")
    println(acc.accountNumber)

    // acc.accountNumber = "ACC0002" // Error
    acc.updateAccountNumber("ACC0002")
    println(acc.accountNumber)
}
