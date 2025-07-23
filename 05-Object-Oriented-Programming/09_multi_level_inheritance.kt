// Multi Level Inheritance

open class Employees(val empId: Int) {

    fun work() = println("Employee $empId is working")
}

open class Manager(empId: Int, val teamSize: Int) : Employees(empId) {

    fun manageTeam() = println("Managing a team of $teamSize people")
}

class ProjectManager(empId: Int, teamSize: Int, val project: String) : Manager(empId, teamSize) {
    
    fun leadTeam() = println("Leading project : $project")
}

fun main() {

    val pm = ProjectManager(111, 6, "BMW")
    pm.work()
    pm.manageTeam()
    pm.leadTeam()
}
