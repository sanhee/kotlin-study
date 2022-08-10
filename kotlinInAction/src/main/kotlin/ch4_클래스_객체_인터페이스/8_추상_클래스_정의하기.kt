package ch4_클래스_객체_인터페이스

abstract class Animated {
    abstract fun animate() // 추상 함수는 open이며, 하위 클래스에서 반드시 override 해야한다.

    open fun stopAnimating(){
        // 추상 클래스에 속했더라도 비추상 함수는 기본적으로 final이지만, 원한다면 open으로 override할 수 있다.
    }
    fun animateTwice(){
        // final
    }
}