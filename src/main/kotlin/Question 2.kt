fun main() {
    //Question 2
    val groupA = listOf("a", "b", "c", "d", "e", "a", "g", "r", "f")
    val groupB = listOf("ant", "bee", "element", "dog", "cat")

    val map = mutableMapOf<Char, MutableList<String>>()
    for (str in groupA + groupB) {
        val key = str.first()
        map.getOrPut(key) {
            mutableListOf()
        }.add(str)
    }
    //Question 3
    map['A'] = mutableListOf("ant")
    map['B'] = mutableListOf("bee")
    map['E'] = mutableListOf("element")
    map['D'] = mutableListOf("dog")
    map['C'] = mutableListOf("cat")
    println(map)
}