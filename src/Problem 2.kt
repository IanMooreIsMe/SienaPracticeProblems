import kotlin.test.assertEquals

object Problem2 {
    fun run(m: Int, n: Int) : Int {
        return (0 .. m).map { (m - it) * (n - it) }.sum()
    }
}

fun main(args: Array<String>) {
    assertEquals(204, Problem2.run(8, 8))
    assertEquals(20, Problem2.run(3, 4))
    assertEquals(299, Problem2.run(2, 100))
}