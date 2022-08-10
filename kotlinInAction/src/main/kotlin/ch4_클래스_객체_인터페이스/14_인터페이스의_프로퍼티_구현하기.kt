package ch4_클래스_객체_인터페이스

/*
    코틀린에서는 인터페이스에 추상 프로퍼티 선언을 넣을 수 있다.
     - 자바에서 추상 메서드임
     - 즉, 커스텀 게터를 구현해줘야함.
 */
interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
    private fun getFacebookName(accountId: Int): String = accountId.toString()
}

fun main(){
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
    println(FacebookUser(2546).nickname)
}
