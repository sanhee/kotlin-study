package ch7_연산자_오버로딩과_기타_관례

class Point2(val x: Int, val y: Int){
    override fun equals(obj: Any?): Boolean {
        if(obj === this) return true
        if(obj !is Point2) return false
        return obj.x == x && obj.y == y
    }
}

fun main() {
    println(Point2(10, 20) == Point2(10, 20))
    println(Point2(10, 20) != Point2(5, 5))
    println(null == Point2(1, 2))
}