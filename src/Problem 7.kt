import kotlin.test.assertEquals

object Problem7 {
    fun run(width: Int, height: Int, tiles: List<String>) : String {
        return ""
    }
}

fun main(args: Array<String>) {
    assertEquals("0\n9 7 8 7 9\n8 9 8 9 5 7\n6 8 5 9 7\n6 1 2 6\n4 6 1 3 2\n8 9 3 1 1 4\n3 1 2 2 1",
            Problem7.run(8, 8, listOf(
                    "B", "23\\", "30\\", "B", "B", "27\\", "12\\", "16\\",
                    "\\16", "W", "W", "B", "17\\24", "W", "W", "W",
                    "\\17", "W", "W", "15\\29", "W", "W", "W", "W",
                    "\\35", "W", "W", "W", "W", "W", "12\\", "B",
                    "B", "\\7", "W", "W", "7\\8", "W", "W", "7\\",
                    "B", "11\\", "10\\16", "W", "W", "W", "W", "W",
                    "\\21", "W", "W", "W", "W", "\\5", "W", "W",
                    "\\6", "W", "W", "W", "B", "\\3", "W", "W")))
}