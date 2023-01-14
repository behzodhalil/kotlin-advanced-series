package `03-reusability`

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
fun main() {
    val packages = listOf(
        Package(name = "Computer", "USA"),
        Package(name = "Chair", "Canada"),
        Package(name = "Cup", "Canada")
    )

    val result = packages
        .filter {
            it.country != "Canada"
        }
        .map {
            it.copy(country = "Uzbekistan")
        }
        .count()

    val measureTime = measureTime {
        packages
            .filter {
                it.country != "Canada"
            }
            .map {
                it.copy(country = "Uzbekistan")
            }
            .count()
    }

    println(result)
    println(measureTime)
}

data class Package(
    val name: String,
    val country: String
)