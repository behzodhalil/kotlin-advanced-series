package safety

/**
 * State management is hard:
 * - It is especially problematic in case of unexpected situations or errors.
 * - State of immutable element is clear. Mutable state is much harder to comprehend.
 * - It requires proper synchronization in multi-threaded programs. Every mutation is a potential conflict.
 * - Mutable elements are harder to test.
 */

private typealias Balance = Int

private interface BankAccount {
    fun withdraw(amount: Balance)
    fun deposit(amount: Balance)
}

private class DefaultBankAccount: BankAccount {
    var balance:Balance = 0
        private set

    override fun withdraw(amount: Balance) {
        balance-=amount
    }

    override fun deposit(amount: Balance) {
        balance+=amount

        // Do not do this!
        // balance.plus(amount)
    }
}

private fun main() {
    val bankAccount = DefaultBankAccount()

    bankAccount.deposit(50)
    println(bankAccount.balance)

    bankAccount.withdraw(20)
    println(bankAccount.balance)
}