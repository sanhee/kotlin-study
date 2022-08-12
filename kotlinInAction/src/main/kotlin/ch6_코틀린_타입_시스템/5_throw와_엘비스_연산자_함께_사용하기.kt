package ch6_코틀린_타입_시스템

class Address2(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company2(val name: String, val address: Address2?)
class Person2(val name: String, val company: Company2?)

fun printShippingLabel(person: Person2) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")

    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main() {
    val address = Address2("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company2("Jetbrains", address)
    val person = Person2("Dmitry", jetbrains)

    printShippingLabel(person) // Elsestr. 47 \n 80687 Munich, Germany
    printShippingLabel(Person2(name = "Alexey", company = null)) // IllegalArgumentException: No address
}

