package ch3_함수_정의와_호출

fun <T> Collection<T>.joinToString(
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
    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))
}