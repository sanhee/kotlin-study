package ch6_코틀린_타입_시스템


fun strLenSafe(s: String?): Int = if(s != null){
    s.length
}else {
    0
}