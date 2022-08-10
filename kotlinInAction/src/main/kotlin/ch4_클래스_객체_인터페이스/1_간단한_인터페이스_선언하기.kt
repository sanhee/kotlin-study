package ch4_클래스_객체_인터페이스

interface Clickable {
    fun click()
}

/*
    리스트 4.2 단순한 인터페이스 구현하기
    - 코틀린에서는 콜론(:)을 붙이고 인터페이스와 클래스 이름을 적는 것으로 클래스 확장과 인터페이스 구현을 모두 처리한다.
 */

class Button : Clickable {
    override fun click() {
        println("I was clicked")
    }
}

/*
    리스트 4.3 인터페이스 안에 본문이 있는 디폴트 메소드 정의하기
 */

interface Clickable2 {
    fun click()
    fun showOff() = println("I'm default method")
}

fun main() {
    println(Button().click()) // I was clicked
}