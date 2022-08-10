package ch3_함수_정의와_호출

/*
    디폴트 파라미터 값 사용
 */

fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String =""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) { // 첫 원소 앞에는 구분자를 붙이면 안된다.
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(){
    val list = listOf(1, 2, 3)
    println(joinToString2(list, ";", "(", ")")) // (1;2;3)
    println(joinToString2(list)) // 1, 2, 3
    println(joinToString2(list, ";"))
}