package `06-make it cheap`

fun main() {
    val list = intArrayOf(20, 10, 30, 40)

    findSmallest(list).apply {
        println(this)
    }

    selectionSort(list).apply {
        println(this)
    }

    selectionSortByDescending(list).apply {
        println(this)
    }
}

private fun findSmallest(arr: IntArray): Int {
    var smallest = arr[0]
    var smallestIndex = 0

    for (index in arr.indices) {
        if (smallest > arr[index]) {
            smallest = arr[index]
            smallestIndex = index
        }
    }

    return smallestIndex
}

private fun selectionSort(arr: IntArray): List<Int> {
    return arr.sorted()
}

private fun selectionSortByDescending(arr:IntArray):  List<Int> {
    return arr.sortedDescending()
}