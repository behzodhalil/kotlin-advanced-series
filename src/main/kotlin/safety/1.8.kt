package safety

class JsonParsingException : Exception()

fun String.readObjectOrNull(): Result {
    if (isEmpty()) {
        return Failure(JsonParsingException())
    }
    return Success(this)

}

sealed class Result
class Success(val result: String) : Result()
class Failure(val throwable: Throwable) : Result()

