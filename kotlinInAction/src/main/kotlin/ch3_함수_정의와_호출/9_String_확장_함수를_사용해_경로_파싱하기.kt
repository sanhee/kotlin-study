package ch3_함수_정의와_호출


/*
    코틀린에서는 정규식을 직접 사용하지 않고도 문자열을 쉽게 파싱할 수 있다.
     - 정규식은 나중에 알아보기 힘든 경우가 많다.
 */

fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun main() {
    parsePath("/Users/yole/kotlin-book/chapter.adoc") // Dir: /Users/yole/kotlin-book, name: chapter, ext: adoc
}