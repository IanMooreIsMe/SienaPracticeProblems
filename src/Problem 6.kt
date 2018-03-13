import kotlin.test.assertEquals

object Problem6 {
    fun run(tiles: Int, snakes: Map<Int, Int>, ladders: Map<Int, Int>) : Int {
        return 0
    }
}

fun main(args: Array<String>) {
    assertEquals(7, Problem6.run(100,
            mapOf(16 to 6, 49 to 11, 62 to 19, 87 to 24, 47 to 26, 56 to 53, 64 to 60, 95 to 75, 98 to 78, 1 to 38),
            mapOf(4 to 14, 9 to 31, 21 to 42, 28 to 84, 36 to 44, 51 to 67, 71 to 91, 80 to 100)
    ))
}