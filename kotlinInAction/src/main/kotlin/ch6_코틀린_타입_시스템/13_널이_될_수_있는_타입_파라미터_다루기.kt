package ch6_코틀린_타입_시스템

/*
    타입 파라미터 T에 물음표가 분어있지 않지만 t는 null을 받을 수 있다.

    - 타입 파라미터가 널이 아님을 확실히 하려면 널이 될 수 없는 타입 상한 upper bound를 지정해야한다.
 */
fun <T> printHashCode(t:T) {
    println(t?.hashCode()) // "t"가 null이 될 수 있으므로 안전한 호출을 써야만 한다.
}

fun main() {
    printHashCode(null) // null, t의 타입은 Any?로 추론된다.
}