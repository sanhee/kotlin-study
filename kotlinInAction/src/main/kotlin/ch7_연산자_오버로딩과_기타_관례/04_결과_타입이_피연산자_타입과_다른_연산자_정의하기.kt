package ch7_연산자_오버로딩과_기타_관례


operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    println('a' * 3) // aaa
}