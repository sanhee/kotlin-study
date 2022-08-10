package ch2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException


/*
    코를린의 예외 처리

    자바 코드와 가장 큰 차이는 thorws절이 코드에 없다는 점
    이유: 코틀린에서는 unchecked exception과 checked exception을 구별하지 않는다.
 */

fun readNumber(reader: BufferedReader) : Int? {
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e: NumberFormatException){
        return null
    }finally {
        reader.close()
    }
}

/*
    리스트 2.28 try를 식으로 사용하기
 */
fun readNumber2(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e: NumberFormatException){
        return
    }
    println(number)
}

/*
    리스트 2.29 catch에서 값 반환하기
 */

fun readNumber3(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e: NumberFormatException){
        null
    }
    println(number)
}

fun main(){
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}