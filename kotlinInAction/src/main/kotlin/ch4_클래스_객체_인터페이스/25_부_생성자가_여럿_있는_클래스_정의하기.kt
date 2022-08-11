package ch4_클래스_객체_인터페이스

class User5{
    private val nickname: String

    constructor(email: String){
        nickname = email.substringBefore('@')
    }

    constructor(facebookUser: FacebookUser){
        nickname = facebookUser.nickname
    }
}
