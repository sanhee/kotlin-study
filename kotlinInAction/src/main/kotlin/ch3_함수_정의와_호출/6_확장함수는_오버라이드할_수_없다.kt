package ch3_함수_정의와_호출


/*
    확장함수는 정적으로 결정된다.
    - 즉, 확장 함수는 오버라이드할 수 없다.

    호출 우선순위: 멤버 함수 > 확장 함수
    - 클래스의 API를 변경할 경우 항상 이를 염두해야한다.
 */

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    val view: View = Button()
    view.click() // Button clicked!   -> "view"에 저장된 값의 실제 타입에 따라 호출할 메소드가 동적으로 결정된다.

    view.showOff() // I'm a view!  -> "정적으로 정의된 참조타입에 따라 출력, 확장 함수는 정적으로 결정된다."
}