package ch4_클래스_객체_인터페이스

import java.io.File


/*
    object 키워드 : 싱글턴 쉽게 생성
 */

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = false)
    }
}

fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
}