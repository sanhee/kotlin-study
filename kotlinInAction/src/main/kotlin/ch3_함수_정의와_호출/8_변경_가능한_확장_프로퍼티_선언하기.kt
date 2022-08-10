package ch3_함수_정의와_호출


/*
    확장 함수와 마찬가지로 확장 프로퍼티도 뒷받침하는 필드가 없어서 상태를 가질 수 없고, 초기화 코드도 쓸 수 없다.

    StringBuilder와 같은 프로퍼티를 정의한다면 StringBuilder의 맨 마지막 문자는 변경 가능하므로 프로퍼티를 var로 만들 수 있다.
 */

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }


fun main(){
    val sb = StringBuilder("Kotlin?")
    println(sb) // Kotlin?

    sb.lastChar = '!'
    println(sb) // Kotlin!
}