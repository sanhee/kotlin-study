package ch4_클래스_객체_인터페이스

class User2(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name: 
                "$field" -> "$value".""".trimIndent()
            )
            field = value
        }
}

fun main() {
    val user = User2("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"

    /*
        Address was changed for Alice:
        "unspecified" -> "Elsenheimerstrasse 47, 80687 Muenchen".
     */
}