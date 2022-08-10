package ch2

import kotlin.IllegalArgumentException

/*
    리스트 2.17 식을 표현하는 클래스 계층
 */

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr


/*
    리스트 2.18 if 연쇄를 사용해 식을 계산하기
 */

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num  // Num으로의 타입 변환은 스마트 캐스트로 인해 불필요한 중복이다.
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}


/*
    리스트 2.19 값을 만들어내는 If expression
 */

fun eval2(e: Expr): Int = if (e is Num) {
    e.value
} else if (e is Sum) {
    eval2(e.right) + eval2(e.left)
} else {
    throw IllegalArgumentException("Unknown expression")
}

/*
    리스트 2.20 if 중첩 대신 when 사용하기
 */

fun eval3(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval3(e.right) + eval3(e.left)
    else -> throw IllegalArgumentException("Unknown expression")
}

/*
    리스트 2.21 분기에 복잡한 동작이 들어가 있는 when 사용하기
 */

fun evalWithLogging(e: Expr): Int = when(e){
    is Num -> {
        println("num: ${e.value}")
        e.value
    }
    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum: $left + $right")
        left + right
    }
    else -> throw IllegalArgumentException("Unknown expression")
}





fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    println(eval2(Sum(Sum(Num(1), Num(2)), Num(3))))
    println(eval3(Sum(Sum(Num(1), Num(2)), Num(3))))
}