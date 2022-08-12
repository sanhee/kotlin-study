package ch7_연산자_오버로딩과_기타_관례

data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String) : NameComponents { // 값을 저장하기 위한 데이터 클래스를 선호한다.
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1]) // 함수에서 데이터 클래스의 인스턴스를 반환한다.
}

fun main() {
    val (name, ext) = splitFilename("example.kt") // 구조 분해 선언 구문 사용
    println(name)
    println(ext)
}