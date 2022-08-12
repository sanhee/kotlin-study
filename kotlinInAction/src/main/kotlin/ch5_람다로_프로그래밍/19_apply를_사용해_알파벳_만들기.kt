package ch5_람다로_프로그래밍

/*
    apply 함수는 with와 유사하다.

    차이점: apply는 항상 자신에게 전달된 수신 객체를 반환한다.

     - 아래 예제에서 보면, apply를 실행한 결과는 수신 받은 StringBuilder 객체다.
     따라서 그 객체의 toString을 호출해서 String 객체를 얻을 수 있다.
 */

fun alphabet6() = StringBuilder().apply {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()