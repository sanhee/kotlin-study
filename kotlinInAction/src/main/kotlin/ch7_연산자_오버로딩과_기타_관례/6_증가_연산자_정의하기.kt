package ch7_연산자_오버로딩과_기타_관례

import java.math.BigDecimal

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    var bd = BigDecimal.ZERO
    println(bd++) // 0  -> 후위 증가 연산자는 println이 실행된 다음에 값을 증가 시킨다.
    println(++bd) // 2
}