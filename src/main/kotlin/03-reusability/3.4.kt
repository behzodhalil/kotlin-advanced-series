package `03-reusability`

interface Color

class PrimaryColor: Color
class HexColor: Color

class Yellow <C: Color> {
    fun <C> init(colorType: C) {
        println(colorType)
    }
}

fun main() {
    val yellow = Yellow<PrimaryColor>()
    yellow.init(PrimaryColor())
    yellow.init(HexColor())
}