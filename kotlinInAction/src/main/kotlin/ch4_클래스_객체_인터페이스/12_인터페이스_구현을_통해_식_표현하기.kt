package ch4_클래스_객체_인터페이스


/*
    항상 디폴트 분기를 추가하는게 불편하다.
 */

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr) : Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.right) + eval(e.left)
    else -> throw IllegalArgumentException("Unknown expression") // 디폴트 분기가 항상 필요하다.
}