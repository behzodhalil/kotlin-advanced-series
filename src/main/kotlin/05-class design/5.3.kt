package `05-class design`

abstract class Uploader {
    abstract fun upload()
}

/**
 * Only one class may appear in a supertype list
 * class Image: Downloader(), Uploader() -> X {}
 */


class ImageUploader: Uploader() {
    override fun upload() {
        print("Image is uploading...")
    }
}