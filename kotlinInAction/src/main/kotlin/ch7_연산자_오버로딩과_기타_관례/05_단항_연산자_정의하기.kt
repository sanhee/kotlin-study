package ch7_연산자_오버로딩과_기타_관례

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

fun main() {
    val p = Point(10, 20)
    println(-p)
}