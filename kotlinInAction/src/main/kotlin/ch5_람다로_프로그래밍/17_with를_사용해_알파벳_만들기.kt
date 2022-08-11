package ch5_람다로_프로그래밍

fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for(letter in 'A'..'Z'){
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }


}