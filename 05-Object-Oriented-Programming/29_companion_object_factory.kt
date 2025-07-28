// Real-Life Example: User with companion object Factory

class Users private constructor(val username: String) {

    companion object {
        fun createGuest(): Users {
            return Users("Guest")
        }

        fun createAdmin(): Users {
            return Users("Admin")
        }
    }
}

fun main() {
    val guest = Users.createGuest()
    val admin = Users.createAdmin()

    println(guest.username) // Guest
    println(admin.username) // Admin
}
