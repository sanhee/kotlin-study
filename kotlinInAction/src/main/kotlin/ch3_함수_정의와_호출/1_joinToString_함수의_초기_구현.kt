package ch3_함수_정의와_호출

/*
    세미콜론으로 구분하고 괄호로 리스트를 둘러싸는 함수 직접 구현
    * 선언 부분 고민 필요
      - 어떻게 하면 이 함수를 호출하는 문장을 덜 번잡하게 만들까?
 */

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
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
    println(joinToString(list, ";", "(", ")"))
}