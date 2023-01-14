package `04-object creation`

fun main() {
    val primaryFunctionResult = plus(10, 15)
    val anonymousFunctionResult = plus1(10, 15)
    val referenceFunctionResult = plus2(10, 25)

    println(primaryFunctionResult)
    println(anonymousFunctionResult)
    println(referenceFunctionResult)
}

private fun plus(a: Int, b: Int): Int {
    return a + b
}

private val plus1 = fun(a: Int, b: Int): Int {
    return a + b
}

private val plus2: (Int, Int) -> Int = ::plus

private val plus3 = {
        a: Int, b: Int -> a + b
}
