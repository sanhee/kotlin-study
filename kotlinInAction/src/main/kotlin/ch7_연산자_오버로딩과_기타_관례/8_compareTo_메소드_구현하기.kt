package ch7_연산자_오버로딩과_기타_관례


/*
    필드를 직접 비교하면 코드는 조금 더 복잡해지지만 비교 속도는 훨씬 더 빨라진다는 사실을 기억하라.
    처음에는 성능에 신경 쓰지 말고 이해하기 쉽고 간결하게 코드를 작성하고,
    나중에 그 코드가 자주 호출됨에 따라 성능이 문제가 되면 개선
 */

class Person4(val firstName: String, val lastName: String) : Comparable<Person4> {
    override fun compareTo(other: Person4): Int {
        return compareValuesBy(this, other, Person4::lastName, Person4::firstName)
    }
}

fun main() {
    val p1 = Person4("Alice", "Smith")
    val p2 = Person4("Bob", "Johnson")
    println(p1 < p2) // false
    println("abc" < "bac") // true
}