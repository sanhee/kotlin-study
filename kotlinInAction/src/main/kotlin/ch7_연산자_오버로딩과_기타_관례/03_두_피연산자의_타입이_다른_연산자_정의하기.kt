package ch7_연산자_오버로딩과_기타_관례

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

fun main() {
    val p = Point(10, 20)
    println(p * 1.5) // Point(x=15, y=30)
}