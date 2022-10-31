package safety

/**
 * When we tighten a variable’s scope,
 * it is easier to keep our programs simple to track and manage.
 */



fun main() {
    val users = listOf(User("Behzod"),User("Otabek"),User("Oybek"))

    println("Bad approach")
    var user: User
    for (i in users.indices) {
        user = users[i]
        println("User at $i is $user")
    }

    println("Better approach")
    for (i in users.indices) {
        val user2 = users[i]
        println("User at $i is $user2")
    }

    println("Nicer syntax")
    for ((i, user) in users.withIndex()) {
        println("User at $i is $user")
    }

}