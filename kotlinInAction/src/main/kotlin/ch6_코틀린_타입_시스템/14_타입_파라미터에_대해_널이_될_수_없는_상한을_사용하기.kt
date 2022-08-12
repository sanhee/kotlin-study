package ch6_코틀린_타입_시스템

//  <T: Any> 타입 상한을 통해 파라미터의 Null이 유입되는 것을 방지

fun <T: Any> printHashCode2(t: T) {
    println(t.hashCode())
}

fun main() {
    //printHashCode2(null) // Null can not be a value of a non-null type TypeVariable(T)
}