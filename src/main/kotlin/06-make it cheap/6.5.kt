package `06-make it cheap`

fun main() {
    val ordinaryRange = (1..10)
    val untilRange = 1 until 10
    val downToRange = 10 downTo 1

    ordinaryRange.forEach {
        println("Ordinary range is $it")
    }

    untilRange.forEach {
        println("Until range is $it")
    }

    downToRange.forEach {
        println("Down to range is $it")
    }
}
