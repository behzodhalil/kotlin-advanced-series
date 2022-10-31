package safety

import safety.Number


private typealias Number = Int

private fun main() {
    // Read-only property
    val number1: Number = 10

    // Read-write property
    var number2: Number = 10

    // A read-only property can hold a mutable object
    val list = mutableListOf(1, 2, 3, 4)
    list.add(5)

    println(number1)
    println(number2)
    println(list)

    var number3 = 0
}

