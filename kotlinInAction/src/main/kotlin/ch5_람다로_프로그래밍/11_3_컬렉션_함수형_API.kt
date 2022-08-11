package ch5_람다로_프로그래밍

import java.util.*

class Book(var title: String, val authors: List<String>)

fun main() {
    data class Person(val name: String, val age: Int)

    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 }) // [2, 4]

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 }) // [Person(name=Bob, age=31)]

    println(list.map { it * it }) // [1, 4, 9, 16]

    println(people.map { it.name }) // [Alice, Bob]

    println(people.map(Person::name)) // 멤버 참조, [Alice, Bob]

    // 30살 이상인 사람의 이름을 출력
    println(people.filter { it.age > 30 }.map(Person::name)) //[Bob]

    // 가장 나이 많은 사람의 이름 출력
    // 목록에서 최대값을 구하는 계속 반복한다는 단점이 존재
    println(people.filter { it.age == people.maxBy(Person::age)!!.age })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.uppercase(Locale.getDefault()) })


    // all. any, count, find: 조건을 만족하는지 판단하는 연산

    val canBeInClub27 = { p: Person -> p.age <= 27 }

    val people4 = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people4.all(canBeInClub27)) // false

    println(people.any(canBeInClub27)) // true

    println(!list.all { it == 3 }) // true, !를 눈치 채지 못하는 경우가 자주 있다. 따라서 이런 식보다는 any를 사용한는 식이 더나음

    println(list.any { it != 3 })  // true

    val people6 = listOf(Person("Alice", 27), Person("Bob", 32))
    println(people6.find(canBeInClub27))

    val people7 = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people7.groupBy { it.age })


    // flatMap 함수는 먼저 인자로 주어진 람다를 컬렉션의 모든 객체에 적용하고(또는 맵핑하기) 람다를 적용한 결과 얻어지는 여러 리스트를 한 리스트로 한데 모은다.
    val books = listOf(Book("1", listOf("author")), Book("2", listOf("author")), Book("3", listOf("author3")))

    println(books.flatMap { it.authors }.toSet()) // [author, author3]
    println(books.map {it.authors}.toSet()) // [ [author], [author3] ]

    var strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() }) // [a, b, c, d, e, f]

    val books2 = listOf(Book("Thursday Next", listOf("Jasper Fforde")), Book("Mort", listOf("Terry Pratchett")), Book("Good Omens", listOf("Terry Practchett", "Neil Gaiman")))

    println(books.flatMap { it.authors }.toSet()) // [author, author3]

}