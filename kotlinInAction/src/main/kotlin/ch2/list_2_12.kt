package ch2

fun getMnemonic(color: Color) = when (color){
    Color.RED -> "Richard"
    Color.ORANGE -> "Orange"
    Color.YELLOW -> "York"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
    else -> {}
}

fun main(){
    println(getMnemonic(Color.BLUE))
}