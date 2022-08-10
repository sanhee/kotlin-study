package ch4_클래스_객체_인터페이스

/*
    toString, equals, hasCode
    - 자바에서는 equals를 오버라이드할 때 반드시 hashcode도 함께 오버라이드 해야하는 이유
      : JVM 언어에서는 equals()가 true를 반환하는 두 객체는 반드시 같은 hashCode()를 반환해야한다는 제약이 있음.
 */

data class Client(val name: String, val postalCode: Int)


/*
    데이터 클래스와 불변성: copy() 메서드
    - 일부만 변경할 수도 있다.
 */

fun main() {
    val lee = Client("이", 4122)
    println(lee)

    val park = lee.copy(name = "박")
    println(park)
}