package ch6_코틀린_타입_시스템

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()){
        println("Please file in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)
}