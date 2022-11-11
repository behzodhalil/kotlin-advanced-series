package `05-class design`

/**
 * The reason is that HashSet uses the add method under the hood of addAll.
 * The counter is then incremented twice for each element added using addAll.
 */

class CounterSet<T>: HashSet<T>() {

    var elementsAdd: Int = 0
        private set

    override fun add(element: T): Boolean {
        elementsAdd++
        return super.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elementsAdd + elements.size
        return super.addAll(elements)
    }
}