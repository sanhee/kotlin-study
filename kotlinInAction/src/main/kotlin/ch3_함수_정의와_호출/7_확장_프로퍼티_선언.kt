package ch3_함수_정의와_호출


/*
    확장 프로퍼티
    - 기존 클래스 객체에 대한 프로퍼티 형식의 구문으로 사용할 수 있는 API를 추가할 수 있다.
     - 하지만 상태를 저장할 수 없다.
     - 뒷받침하는 필드가 없어서, 기본 게터 구현을 제공할 수 없다.
       - 커스텀 게터 정의가 필요하다.
 */

val String.lastChar: Char
    get() = this[this.length - 1]


fun main(){
    println("happy".lastChar);
}