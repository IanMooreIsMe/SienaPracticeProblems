import kotlin.test.assertEquals

object Problem4 {
    fun run(line1: List<Int>, line2: List<Int>) : String {
        return if (isCycle(line1, line2)) "CYCLE" else "NOCYCLE"
    }

    private fun <T> isCycle(list1: List<T>, list2: List<T>) : Boolean {
        val startIndex = list2.indexOf(list1.first())
        return list1.filterIndexed { index, t ->
            list2[(index + startIndex).rem(list1.size)] == t
        }.size == list1.size
    }
}

fun main(args: Array<String>) {
    assertEquals("CYCLE", Problem4.run(listOf(11, 44, 85, 93, 36, 28, 71, 29, 59, 64), listOf(36, 28, 71, 29, 59, 64, 11, 44, 85, 93)))
    assertEquals("NOCYCLE", Problem4.run(listOf(36, 28, 71, 29, 59, 64, 11, 44, 85, 93), listOf(36, 93, 85, 44, 11, 64, 59, 29, 71, 28)))
    assertEquals("NOCYCLE", Problem4.run(listOf(11, 44, 85), listOf(11, 434, 85, 26, 72)))
    assertEquals("CYCLE", Problem4.run(listOf(11, 22, 33), listOf(33, 11, 22)))
    assertEquals("NOCYCLE", Problem4.run(listOf(11, 22, 33, 44), listOf(11, 44, 33, 22)))
}