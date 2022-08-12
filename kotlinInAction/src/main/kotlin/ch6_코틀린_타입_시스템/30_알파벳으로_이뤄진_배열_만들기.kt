package ch6_코틀린_타입_시스템

import java.util.*

fun main() {
    val letters = Array<String>(26) { i -> ('a' + i).toString()}
    val letters2 = arrayOf('a', 'b', 'c')

    val list = listOf(1,2,3,4,5)
    val nums = arrayOf(*list.toTypedArray()) // 스프레드 연산자(*)로 배열 원소를 하나씩 나열한다.

    println(letters.contentToString())
    println(letters2.contentToString())
    println(nums.contentToString())

    // 배열에 forEachIndexed 사용
    letters.forEachIndexed { index, element -> println("Argument $index is: $element") }
}