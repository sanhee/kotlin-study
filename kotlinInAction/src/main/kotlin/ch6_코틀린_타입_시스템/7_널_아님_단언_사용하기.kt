package ch6_코틀린_타입_시스템

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!  // NullPointerException
    println(sNotNull)
}

fun main() {
    ignoreNulls(null)
}