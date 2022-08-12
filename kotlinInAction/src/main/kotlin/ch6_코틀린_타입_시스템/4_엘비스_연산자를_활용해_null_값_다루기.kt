package ch6_코틀린_타입_시스템

fun strLenSafe2(s: String?): Int = s?.length ?: 0

fun main() {
    println(strLenSafe2("abc")) // 3
    println(strLenSafe2(null)) // 0
}