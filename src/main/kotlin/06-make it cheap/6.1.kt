package `06-make it cheap`

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
fun main() {
    val resultInline = measureTime {
        repeatInline(3) {
            println("It is inline function")
        }
    }

    val resultNonInline = measureTime {
        repeatNonInline(3) {
            println("It is non-inline function")
        }
    }

    println(resultInline)
    println(resultNonInline)
}

private inline fun repeatInline(time: Int, block: () -> Unit) {
    for (i in 0..time) {
        block()
    }
}

private fun repeatNonInline(time: Int, block: () -> Unit) {
    for (i in 0 until time) {
        block()
    }
}