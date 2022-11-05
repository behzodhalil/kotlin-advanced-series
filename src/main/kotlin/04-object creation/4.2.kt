package `04-object creation`

data class MyLinkedList<T>(
    val node: T,
    val next: MyLinkedList<T>?
) {
    override fun toString(): String {
        return if (next!=null) {
            "$node -> $next"
        } else {
            "$node"
        }
    }
}

fun main() {
    val list = MyLinkedList(node = 1, MyLinkedList(node = 2,null))
    println(list)
}