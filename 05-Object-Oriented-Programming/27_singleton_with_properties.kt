// Singleton with properties

object AppConfig {
    var theme: String = "Light"
    var language: String = "English"
}

fun main() {
    println(AppConfig.theme)
    println(AppConfig.hashCode())       // 1309552426

    AppConfig.theme = "Dark"
    
    println(AppConfig.theme)
    println(AppConfig.hashCode())       // 1309552426
}
