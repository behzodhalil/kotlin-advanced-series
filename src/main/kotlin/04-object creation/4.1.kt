package `04-object creation`

class Element {

    private var element: String = ""

    fun getElement(): String {
        return element
    }

    fun setElement(value: String){
        element = value
    }
}

fun create(): Element {
    return Element()
}

fun main() {
    val element = create()
    element.setElement("10")
    val result = element.getElement()
    print(result)
}