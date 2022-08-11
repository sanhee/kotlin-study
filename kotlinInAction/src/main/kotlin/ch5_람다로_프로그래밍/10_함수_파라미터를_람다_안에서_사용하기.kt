package ch5_람다로_프로그래밍

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {println("$prefix $it")}
}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(messages = errors, prefix = "Error:")
}