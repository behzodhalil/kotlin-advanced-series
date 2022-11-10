package `05-class design`

/**
 * The composition is better because we can choose what behavior do we need.
 * When we use inheritance we take everything from the superclass,
 * not only what we need.
 *
 */
class Progress {
    fun showProgress() {
        print("Progress is showing...")
    }
    fun hideProgress() {
        print("Progress is hiding...")
    }
}

class AudioLoader {
    val progress = Progress()

    fun load() {
        progress.showProgress()
    }

    fun stop() {
        progress.hideProgress()
    }
}