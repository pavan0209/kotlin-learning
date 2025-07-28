// Sealed Class

sealed class TrafficSignal {
    object Red : TrafficSignal()
    object Yellow : TrafficSignal()
    object Green : TrafficSignal()
}

fun action(signal: TrafficSignal) =
        when (signal) {
            TrafficSignal.Red -> "Stop"
            TrafficSignal.Yellow -> "Get Ready"
            TrafficSignal.Green -> "Go"
        }

fun main() {
    println(action(TrafficSignal.Green))        // Output: Go
}
