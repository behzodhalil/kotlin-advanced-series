package `03-reusability`

class Home<out T>

open class PrimaryStuff

class Sofa: PrimaryStuff()
class Desk: PrimaryStuff()

fun main() {
    val sofa: Home<PrimaryStuff> = Home<Sofa>()

    /**
     * Don't do this
     * val desk: Home<Desk> = Home<PrimaryStuff>()
     */
    val desk: Home<PrimaryStuff> = Home<Desk>()

}