package `06-make it cheap`

inline fun requestNewToken(
    hasToken: Boolean,
    crossinline onRefresh: () -> Unit,
    noinline onGenerate: () -> Unit
) {
    if (hasToken) {
        httpCallback("get-token", onGenerate)
    } else {
        httpCallback("refresh-token") {
            onRefresh()
        }
    }
}

fun httpCallback(
    httpContext: String, callback: () -> Unit
) {
    // TODO
}