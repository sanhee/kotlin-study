package ch7_연산자_오버로딩과_기타_관례

fun printEntries(map: Map<String, String>){
    for((key, value) in map){
        println("$key -> $value")
    }
}

fun main() {
    val map = mapOf("Oracle" to "Java", "Jetbrains" to "Kotlin")
    printEntries(map)
}