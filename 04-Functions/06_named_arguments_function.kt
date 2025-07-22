// Function with named arguments

fun employeeInfo(empId: Int, empName: String, empSalary: Double = 30000.50) {
    println("Employee Id : $empId")
    println("Employee Name : $empName")
    println("Employee Salary : $empSalary")
}

fun main() {
    employeeInfo(empId = 10, empName = "Pavan Sonawane")
    println()
    employeeInfo(empName = "Rushi Birari", empSalary = 40000.10, empId = 15)
}
