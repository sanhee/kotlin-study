package ch5_람다로_프로그래밍

/*
    코틀린에서는 자바와 달리 람다에서 람다 밖 함수에 있는 final이 아닌 변수에 접근할 수 있고, 그 변수를 변경할 수도 있다.

      방법)
        - 안에 들어있는 원소는 변경 가능할지라도 배열이나 클래스의 인스턴스에 대한 참조를 final로 만들면 포획이 가능하다.
        - 왜? final은 재할당 불가 키워드이기 때문임.

        1.  변경 가능한 변수를 저장하는 원소가 단 하나뿐인 배열을 선언
        2.  변경 가능한 변수를 필드로 하는 클래스 선언

    아래 예제의 clientErrors, serverErrors와 같이 람다 안에서 사용하는 외부 변수를 '람다가 capture한 변수라고 부른다.'
     - 기본적으로 함수 안에 정의된 로컬 변수의 생명주기는 함수가 반환되면 끝난다.
     - 하지만 어떤 함수가 자신의 로컬 변수를 capture한 람다를 반환하거나 다른 변수에 저장한다면,
        - 로컬 변수의 생명주기와 함수의 생명주기가 달라질 수 있다.
        - capture한 변수가 있는 람다를 저장해서 함수가 끝난 뒤에 실행해도 람다의 본문 코드는 여전히 capture한 변수를 읽거나 쓸 수 있다.
 */
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")){
            clientErrors++
        } else if (it.startsWith("5")){
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}
