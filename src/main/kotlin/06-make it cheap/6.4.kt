package `06-make it cheap`

fun main() {
    val name = "Behzod"
    println("Hello, $name")
    greet(name)
    println("getting ready to say bye")
    bye()
}

private fun bye() = println("ok, bye")

private fun greet(name: String) = println("how are you, $name")