package ch7_연산자_오버로딩과_기타_관례

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}