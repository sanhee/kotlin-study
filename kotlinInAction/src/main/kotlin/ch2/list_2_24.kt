package ch2

import java.util.*


/*
    리스트 2.24 맵을 초기화하고 이터레이션하기

    구조 분해 문법은 자바스크립트랑 비슷한듯

    *키를 사용해 맵의 값을 가져오거나 키에 해당하는 값을 설정하는 코틀린 기능

    map[key] = value

 */

fun main() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps){ // 구조 분해 문법
        println("$letter = $binary")
    }
}