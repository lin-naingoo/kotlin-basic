package collections

/* Return the reverse list of given list */

fun reverseList(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    /*for (i in list.indices){
        result.add(list.get(list.size - 1 - i))
    }*/
    for (i in list.size - 1 downTo 0){
        result.add(list[i])
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 5, 4, 8)
    println(reverseList(list))
}