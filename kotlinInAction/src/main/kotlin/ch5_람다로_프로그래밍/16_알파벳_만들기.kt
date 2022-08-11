package ch5_람다로_프로그래밍

fun alphabet(): String {
    val result = StringBuilder()
    for(letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun main() {
    println(alphabet())
}