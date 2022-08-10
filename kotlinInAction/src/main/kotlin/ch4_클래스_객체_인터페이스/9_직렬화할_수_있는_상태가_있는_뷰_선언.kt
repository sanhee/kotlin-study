package ch4_클래스_객체_인터페이스

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

/*
   중첩 클래스를 사용해 코틀린에서 View 구현하기

   - 자바와의 차이: 중첩 클래스는 명시적으로 요청하지 않는 한 바깥쪽 클래스 인스턴스에 대한 접근 권한이 없다.
 */

class Outer {
    class staticClass(){
        // 자바 static 중첩 클래스
        // 바깥쪽 참조 못함
    }

    inner class Inner {
        fun getOuterReference() : Outer = this@Outer
    }
}