package ch8_고차함수_파라미터와_반환_값으로_람다_사용

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun main() {
    twoAndThree { a, b -> a + b } // The result is 5
    twoAndThree { a, b -> a * b } // The result is 6
}