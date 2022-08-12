package ch6_코틀린_타입_시스템

/*
    let 함수를 safe call 연산자와 함께 사용하면 원하는 식을 평가해서 결과가 널인지 검사한 다음에
    그 결과를 변수에 넣는 작업을 간단한 식을 사용해 한꺼번에 처리할 수 있다.

    let 함수는 null이 아닌 경우에만 호출된다.


    - let 함수는 null이 될 수 있는 타입을 호출할 수 있지만, this가 null인지 검사하지 않는다.
    - 자바와 다르게 코틀린은 this가 널이 될 수 있어서 주의해야한다.
 */

fun sendEmailTo(email: String){
    println("Sending email to $email")
}

fun main() {
    var email: String? = "yole@example.com"
    email?.let {
        sendEmailTo(it)
    }

    email = null
    email?.let{
        sendEmailTo(it) // null 무시
    }
}
