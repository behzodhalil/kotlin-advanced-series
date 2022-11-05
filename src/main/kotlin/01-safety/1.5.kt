package `01-safety`

@JvmInline
private value class Name(val value: String)


private interface UserRepository {
    fun load(): MutableMap<Int, User>
}

private class DefaultUserRepository: UserRepository {
    private val storedUsers: MutableMap<Int, User> = mutableMapOf()

    override fun load() = storedUsers
}

private fun main() {
    val userRepo = DefaultUserRepository()

    val storedUsers = userRepo.load()

    // This is a dangerous way
    storedUsers[1] = User(name ="Behzod")
    println(storedUsers)

    storedUsers[2] = User(name = "Behzod")
    println(storedUsers)

}