package `01-safety`

private data class Element(
    val name: String,
    val size: Int
)

private data class Alarm(
    val time: Int,
    val dueTime: Int
)

private sealed class House() {
    data class Apartment(val rooms: Int) : House()
    data class Condos(val rooms: Int) : House()
}


private fun main() {
    var element = Element(name = "Oxygen", size = 16)
    println(element)

    element = element.copy(name = "Hydrogen")
    println(element)

    val alarm = Alarm(time = 10, dueTime = 22)
    println(alarm)

    renderHouse(House.Apartment(2))
    renderHouse(House.Condos(4))
}

private fun renderHouse(type: House) {
    when(type) {
        is House.Apartment -> {
            if (type.rooms<3) {
                println("This is the tiny apartment")
            } else {
                println("This is the big apartment")
            }
        }
        is House.Condos -> {
            println("Condos has ${type.rooms}")
        }
    }
}