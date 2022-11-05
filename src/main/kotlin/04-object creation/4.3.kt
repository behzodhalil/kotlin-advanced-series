package `04-object creation`

data class MyLinkedList2<T>(
    val head: T,
    val tail: MyLinkedList2<T>?
) {
    override fun toString(): String {
        return if (tail!=null){
            "$head to $tail"
        } else {
            "$head"
        }
    }
}

fun <T> myLinkedListOf(vararg elements: T): MyLinkedList2<T>? {
    if (elements.isEmpty()) return null

    val head = elements.first()
    val elementsTail = elements.copyOfRange(1,elements.size)
    val tail = myLinkedListOf(*elementsTail)

    return MyLinkedList2(head = head, tail = tail)
}

fun main() {
    val list = myLinkedListOf(1,2,3,4)
    print(list)
}