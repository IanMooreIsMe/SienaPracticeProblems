import kotlin.test.assertEquals

object Problem5 {
    fun run(n: Int, jerseys: List<Int>) : String {
        val lockers: List<Int> = (1 .. n).map {
            trips(it, jerseys)
        }
        return "${lockers.min()} ${lockers.max()}"
    }

    private fun trips(player: Int, jerseys: List<Int>) : Int {
        var steps = 0
        var locker = player
        do {
            steps++
            locker = jerseys[locker]
        } while (jerseys[locker] != player)
        return steps
    }
}

fun main(args: Array<String>) {
    assertEquals("1 1", Problem5.run(9, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    assertEquals("9 9", Problem5.run(9, listOf(2, 3, 4, 5, 6, 7, 8, 9, 1)))
    assertEquals("4 1", Problem5.run(9, listOf(2, 3, 4, 5, 6, 7, 8, 9, 1)))
}