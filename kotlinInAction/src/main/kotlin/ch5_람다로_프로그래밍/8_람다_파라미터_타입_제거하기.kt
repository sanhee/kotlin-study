package ch5_람다로_프로그래밍

import ch4_클래스_객체_인터페이스.Person

fun main (){
    val people = listOf(Person("이몽룡", 29), Person("성춘향", 31))

    val max = people.maxBy { p:Person -> p.age }
    val max2 = people.maxBy { p -> p.age } // 파라미터 타입을 생략(컴파일러가 추측)
}