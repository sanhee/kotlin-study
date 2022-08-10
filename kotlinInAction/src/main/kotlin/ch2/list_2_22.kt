package ch2

/*
    리스트 2.22 when을 사용해 피즈버즈 게임 구현
 */
fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

/*
    리스트 2.23 증가 값을 갖고 범위 이터레이션하기
 */
fun downTo(){
    for (i in 100 downTo 1 step 2){
        print(fizzBuzz(i));
    }
}

fun main(){
    for (i in 1..100){
        print(fizzBuzz(i)) // 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11  ...
    }
}