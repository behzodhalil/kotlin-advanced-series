package safety

private fun main() {
    val immutableList = listOf(1,2,3,4)
    println(immutableList)

    // Do not do this!
    // var x mutableListOf
    var mutableList = mutableListOf(1,2,3,4)

    val list = mutableListOf(1,2,3,4)
    var list2 = listOf(1,2,3,4)

    list.add(5)
    list2 = list2 + 5

    println(list)
    println(list2)
}