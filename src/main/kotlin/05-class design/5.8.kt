package `05-class design`


class View

// SAM (single-abstraction method)
interface OnClick {
    fun click(view: View)
}

// SAM (single-abstraction method)
interface OnLongClick {
    fun click(view: View)
}

fun setOnClickListener(listener: (View) -> Unit) {
    //
}

// object that implement the declared function type
object ClickListener: (View) -> Unit {
    override fun invoke(p1: View) {
        TODO("Not yet implemented")
    }
}

fun main() {
    // with a lambda expression
    setOnClickListener { }
    // with an anonymous function
    setOnClickListener(fun(_) {})
    // with an object
    setOnClickListener(ClickListener)

}