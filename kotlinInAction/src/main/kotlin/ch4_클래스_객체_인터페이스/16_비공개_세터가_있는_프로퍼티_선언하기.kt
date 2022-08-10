package ch4_클래스_객체_인터페이스

/*
    private setter
 */

class LengthCounter{
    var counter: Int = 0
    private set

    fun addWord(word: String){
        counter += word.length
    }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")

    println(lengthCounter.counter)
}