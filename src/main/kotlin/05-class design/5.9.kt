package `05-class design`

class Date
class Page

// approach #1 with SAM
class CalendarView {

    var listener: Listener? = null

    interface Listener {
        fun onDateClicked(date: Date)
        fun onPageClicked(page: Page)
    }
}

// approach #2 without SAM
class CalendarView2 {

    var onDateClicked: ((date: Date) -> Unit)? = null
    var onPageClicked: ((page: Page) -> Unit)? = null

}