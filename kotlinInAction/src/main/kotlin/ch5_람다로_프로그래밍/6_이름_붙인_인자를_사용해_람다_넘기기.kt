package ch5_람다로_프로그래밍

import ch4_클래스_객체_인터페이스.Person

fun main (){
    val people = listOf(Person("이몽룡", 29), Person("성춘향", 31))
    val names = people.joinToString(separator = " ",
                                    transform = {p: Person -> p.name} )

    val names2 = people.joinToString(" ") { p:Person -> p.name }
    println(names)
}