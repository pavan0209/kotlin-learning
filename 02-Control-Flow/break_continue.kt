// break and continue keyword

fun main() {

    for (i in 1..100) {

        if (i % 2 == 0) {
            continue
        }

        if (i >= 50) {
            break
        }

        print("$i ")
    }

    println()

    loop@ for (i in 1..100) {
        for (j in 1..10) {
            println("$i :: $j")
            if (i == 5) break@loop
        }
    }

    println()
}
