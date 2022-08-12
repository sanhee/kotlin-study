package ch7_연산자_오버로딩과_기타_관례

data class Point (val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    var p1 = Point(10, 20)
    var p2 = Point(30, 40)

    println(p1 + p2) // Point(x=40, y=60)

    p1 += p2  // 복합 대입 연산자 지원
    println(p1) // Point(x=40, y=60)
}