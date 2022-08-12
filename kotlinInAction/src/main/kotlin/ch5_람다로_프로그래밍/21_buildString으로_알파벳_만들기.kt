package ch5_람다로_프로그래밍


/*
    buildString 함수는 StringBuilder를 활용해 String을 만드는 경우 사용할 수 있는 우아한 해법
    - 코틀린의 표준 라이브러리
    - StringBuilder 객체를 만드는 일 + toString을 호출해주는 일
 */
fun alphabet7() = buildString {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}