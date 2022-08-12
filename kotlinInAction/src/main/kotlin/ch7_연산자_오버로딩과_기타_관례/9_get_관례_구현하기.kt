package ch7_연산자_오버로딩과_기타_관례

/*
    get 이라는 메소드를 만들고 operator 변경자를 붙이기만 하면, get 관례를 정의할 수 있다.
 */
operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val p = Point(10, 20)
    println(p[0])
    println(p[1])
}