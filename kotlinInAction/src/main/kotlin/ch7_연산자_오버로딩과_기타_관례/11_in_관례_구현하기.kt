package ch7_연산자_오버로딩과_기타_관례

/*
    in 연산자와 대응하는 함수는 contains다.
 */
data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x
            && p.y in upperLeft.y until lowerRight.y
}

fun main() {
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect) // true
    println(Point(5, 5) in rect) // false
}