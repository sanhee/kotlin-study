package ch2

/*
    in으로 컬렉션이나 범위의 원소 검사

    !in: 범위속하지 않는지

    *범위는 문자에만 국한되지 않는다. 비교가 가능한 클래스라면 그 클래스의 인스턴스 객체를 사용해 범위를 만들 수 있다.
 */

/*
    리스트 2.25 in을 사용해 값이 범위에 속하는지 검사하기
 */

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'


/*
    리스트 2.26 when에서 in 사용하기
 */

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."
}

fun kotlinInJavaAndScala(){
    print("Kotlin" in "Java".."Scala")  // Java <= Kotlin && Kotlin <= Scala
}



fun main() {
    println(isLetter('q'))
    println(isNotDigit('x'))

    println(recognize('8'))
    println(recognize('a'))

    kotlinInJavaAndScala() // true
}