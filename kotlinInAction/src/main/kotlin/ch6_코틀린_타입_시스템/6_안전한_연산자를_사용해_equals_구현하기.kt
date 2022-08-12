package ch6_코틀린_타입_시스템

class Person3(val firstName: String, val lastName: String){
    override fun equals(other: Any?): Boolean {
       val otherPerson = other as? Person3 ?: return false
       return otherPerson.firstName == this.firstName && otherPerson.lastName == this.lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = Person3("Dmitry", "Jemerov")
    val p2 = Person3("Dmitry", "Jemerov")
    println(p1 == p2) // true, 코틀린의 == 연산자는 equals를 호출한다.
    println(p1 === p2) // false, 참조주소 비교
}