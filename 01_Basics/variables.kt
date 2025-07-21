fun main() {
    val a = 10      // read-only variable
    var b = 20      // mutable variable (can be changed over time)

    println(a)
    println(b)

    // a = 30   //   error: 'val' cannot be reassigned.
    b = 40

    println(a)
    println(b)

    val employeeCount = 20
    println("There are total $employeeCount employees in our company")    // String interpolation

    println("New employees have been joined so current employee count is ${employeeCount + 5}.") 
}