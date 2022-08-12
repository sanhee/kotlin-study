package ch7_연산자_오버로딩과_기타_관례

import java.time.LocalDate

/*
    범위 .. 연산자는 rangeTo 함수를 간략하게 표햔하는 방법

    하지만, Comparable 인터페이스를 구현하면 rangeTo를 정의할 필요가 없음
     - 코틀린 표준 라이브러리르 통해 비교 가능한 원소로 이뤄진 범위를 쉽게 만들 수 있다.
 */


fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)

    println(now.plusWeeks(1) in vacation) // true
}