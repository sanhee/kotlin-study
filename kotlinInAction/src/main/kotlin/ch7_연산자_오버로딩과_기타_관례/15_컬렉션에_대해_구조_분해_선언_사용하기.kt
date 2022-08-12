package ch7_연산자_오버로딩과_기타_관례


data class NameComponents2(val name: String, val extension: String)

fun splitFilename2(fullName: String) : NameComponents2 {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents2(name, extension)
}