package `03-reusability`

interface Tree

class Birch: Tree
class Spruce: Tree

class Forest<T: Tree> {
    fun <T> addTree(tree: T) {
        println(tree)
    }
}

fun main() {
    val birch = Forest<Birch>()
    birch.addTree(Birch())

    val spruce = Forest<Spruce>()
    spruce.addTree(Spruce())
}