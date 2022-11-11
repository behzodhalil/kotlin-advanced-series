package `05-class design`


data class Computer(
    val name: Type,
    val producedTimestamp: String,
    val id: Long
)

enum class Type {
    Samsung,
    Asus,
    Apple,
    Acer,
    LG
}

fun main() {
    val computer = Computer(Type.Samsung, producedTimestamp = "2021", id = 1)

    // position-based destruction
    // we need to adjust every destructuring when the order of elements in data class change.
    // it is also easy to destruct incorrectly by confusing order.
    // it is like pair.
    // pair is used to when we define immediately name values.
    val (type, timestamp) = computer

    println("Computer type is $type")
    println("Produced in $timestamp")

    val person = mapOf(
        1 to "Behzod",
        2 to "Oybek",
        3 to "Abdurahmon",
        4 to "Abduqodir",
        5 to "Sardor"
    )

    // position-based destruction with loop
    for ((id, name) in person) {
        println("The person id is $id;")
        println("The person name is $name")
    }
}