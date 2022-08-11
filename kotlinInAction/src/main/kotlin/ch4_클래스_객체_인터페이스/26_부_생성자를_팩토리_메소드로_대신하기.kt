package ch4_클래스_객체_인터페이스

class User6 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User6(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User6(FacebookUser(accountId).nickname)
    }
}