package ch4_클래스_객체_인터페이스


/*
    sealed 클래스

    - sealed 클래스는 클래스 외부에 자신을 상속한 클래스를 둘 수 없다.
    - when 식에서 sealed 클래스의 모든 하위 클래스를 처리한다면, 디폴트 분기가 필요 없다.
    - sealed로 표시된 클래스는 자동으로 open이다.
 */

sealed class SealedExpr {
    class Num(val value: Int) : SealedExpr()
    class Sum(val left: SealedExpr, val right: SealedExpr) : SealedExpr()
}

fun eval5(e: SealedExpr) : Int = when (e) {
    is SealedExpr.Num -> e.value
    is SealedExpr.Sum -> eval5(e.right) + eval5(e.left)
}