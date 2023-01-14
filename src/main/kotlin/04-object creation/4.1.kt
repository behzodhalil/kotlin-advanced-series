package `04-object creation`

class Element {

    private var element: String = ""

    fun getElement(): String {
        return element
    }

    fun setElement(value: String){
        element = value
    }

    companion object {
        fun create(): Element {
            return Element()
        }
    }
}

fun main() {
    val element = Element.create()
    element.setElement("10")
    val result = element.getElement()
    print(result)
}