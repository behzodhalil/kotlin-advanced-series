package `01-safety`

import kotlin.properties.Delegates

data class Record(
    val name: String,
    val size: Int
)

interface LocalSourceManager {
    fun saveRecord(record: Record)
}

class DefaultLocalSourceManager: LocalSourceManager {
    override fun saveRecord(record: Record) {
        println("Name: ${record.name};\nSize: ${record.size};")
    }
}

interface Solution {
    fun build()
}

class DefaultSolution: Solution {
    private lateinit var manager: LocalSourceManager

    override fun build() {
        manager = DefaultLocalSourceManager()
        manager.saveRecord(Record(name = "Record #1", size = 10))
    }
}

class DefaultSolution2: Solution {
    /**
     * One reason why they are so popular is that they help us safely avoid nullability
     */
    private var manager: LocalSourceManager by Delegates.notNull()

    override fun build() {
        manager = DefaultLocalSourceManager()
        manager.saveRecord(Record(name = "Record #2", size = 12))
    }
}



fun main() {
    val solution = DefaultSolution()
    solution.build()

    val solution2 = DefaultSolution2()
    solution2.build()
}