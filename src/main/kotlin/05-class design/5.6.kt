package `05-class design`

data class Player(
    val name: String,
    val points: Int,
    val id: Long
)

fun main() {
    val player = Player(name = "Behzod", points = 100, id = 1)

    val (name, points, id) = player

    println("Name is $name")
    println("Points are $points")
    println("Id is $id")
}