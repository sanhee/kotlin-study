package ch5_람다로_프로그래밍

import ch4_클래스_객체_인터페이스.Person

fun findTheOldest(people: List<Person>){
    var maxAge = 0
    var theOldest : Person? = null
    for (person in people){
        if(person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
}