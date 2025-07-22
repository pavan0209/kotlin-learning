// A Function with Parameters and No return values

fun welcomeUser(userName: String?) {
    println("Welcome, $userName")
}

fun main() {

    print("Enter your name :: ")
    val name: String? = readLine()
    welcomeUser(name)
}
