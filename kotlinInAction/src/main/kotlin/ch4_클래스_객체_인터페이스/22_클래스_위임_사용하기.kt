package ch4_클래스_객체_인터페이스

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
): MutableCollection<T> by innerSet {
    var objectsAdded = 0



}