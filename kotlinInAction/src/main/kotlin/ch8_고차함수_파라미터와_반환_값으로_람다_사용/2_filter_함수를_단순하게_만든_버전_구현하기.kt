package ch8_고차함수_파라미터와_반환_값으로_람다_사용

import java.lang.StringBuilder

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for(index in indices){
        val element = get(index)
        if(predicate(element)){
            sb.append(element)
        }
    }
    return sb.toString()
}