import kotlin.test.assertEquals

object Problem3 {
    fun run(a: Int, b: Int) : String {
        return (a .. b).mapNotNull {
            if (a < it) {
                5
            } else {
                null
            }
        }.joinToString("\n")
    }
}

fun main(args: Array<String>) {
    assertEquals(
            "1\tPerfect\t1\t1\n" +
            "8\tNormal\t2\t2\n" +
            "9\tPerfect\t1\t2\n" +
            "27\tNormal\t3\t3\n" +
            "28\tNear\t1\t3\t2\n" +
            "35\tNormal\t2\t3\n" +
            "36\tPerfect\t1\t3\n" +
            "64\tNormal\t4\t4\n" +
            "72\tNear\t2\t4\t3\n" +
            "73\tNear\t1\t4\t3\n" +
            "91\tNormal\t3\t4\n" +
            "92\tNear\t1\t4\t2\n" +
            "99\tNormal\t2\t4",
            Problem3.run(1, 99))
}