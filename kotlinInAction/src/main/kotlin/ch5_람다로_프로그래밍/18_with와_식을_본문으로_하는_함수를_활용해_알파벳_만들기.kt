package ch5_람다로_프로그래밍

fun alphabet5() = with(StringBuilder()){
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}