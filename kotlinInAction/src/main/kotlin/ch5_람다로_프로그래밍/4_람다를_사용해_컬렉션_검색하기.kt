package ch5_람다로_프로그래밍

import ch4_클래스_객체_인터페이스.Person

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun main() {
    println(people.maxBy { it.age })
}