package safety

/**
 * The general rule is that if we are not sure about the type, we should specify it.
 */
private fun main() {
    var mouse: Computer = Mouse()
    mouse = Computer()


    //   var mouse = Mouse()
    //   mouse = Computer()
}

open class Computer

class Mouse: Computer()
class Keyboard: Computer()


