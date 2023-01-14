package `03-reusability`

fun main() {
    val map: Map<String,String> = mapOf(
        "name" to "Behzod",
        "surname" to "Bozorboev"
    )

    val name by map
    val surname by map

    println(name)
    println(surname)
}