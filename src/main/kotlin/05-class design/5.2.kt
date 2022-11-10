package `05-class design`

abstract class Downloader {
    abstract fun download()
}

class VideoDownloader: Downloader() {
    override fun download() {
        print("Video is downloading")
    }

}

class ImageDownloader: Downloader() {
    override fun download() {
        print("Image is downloading")
    }
}