/*
    Data Types in kotlin
    1. Numbers (Byte, Short, Int, Long, Float, Double)
    2. Booleans
    3. Characters
    4. Strings
    5. Arrays
*/

fun main() {

    // Integer Types
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1 // Byte
    val tenShort: Short = 1 // Short

    println(one)
    println(threeBillion)
    println(oneLong)
    println(oneByte)
    println(tenShort)

    println(one::class) // prints type of variable
    println(threeBillion::class)
    println(oneLong::class)
    println(oneByte::class)
    println(tenShort::class)

    // Floating-point types
    val pi = 3.14f
    val oneDouble: Double = 1.0

    println(pi)
    println(oneDouble)

    println(pi::class)
    println(oneDouble::class)

    // Booleans
    val flag: Boolean = true
    val nullableFlag: Boolean? = null // nullable boolean
    println(flag)
    println(flag::class)
    println(nullableFlag)

    // Characters
    val aChar: Char = 'a'

    println(aChar)
    println(aChar::class)

    val str = "asdf 1234"
    println(str)
    println(str::class)

    val multiLineString: String = """
    |Hello Pavan,
    |How are you?
    """.trimMargin()

    println(multiLineString)
}
