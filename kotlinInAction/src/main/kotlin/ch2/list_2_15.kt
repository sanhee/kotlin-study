package ch2

import ch2.Color.*
import java.lang.Exception

/*
    when의 분기 조건에 여러 다른 객체 사용
 */

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)){
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    else -> throw Exception("Dirty color")
}