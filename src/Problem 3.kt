import kotlin.test.assertEquals

object Problem3 {
    fun run(a: Int, b: Int) : String {
        return (a .. b).mapNotNull { year ->
            isPerfect(year) + isNear(year) + isNormal(year)
        }.joinToString("")
    }

    private fun isPerfect(year: Int) : String {
        val scubey = scubeyCheck(year)
        return if (scubey != null) "$year\tPerfect\t1\t$scubey\n" else ""
    }

    private fun isNear(year: Int) : String {
        for (start in 1..year) {
            for (skip in start..year) {
                val scubey = scubeyCheck(year, start, skip)
                when {
                    scubey != null && (scubey < skip || start == skip) -> return ""
                    scubey != null -> return "$year\tNear\t$start\t$scubey\t$skip\n"
                }
            }
        }
        return ""
    }


    private fun isNormal(year: Int) : String {
        for (start in 2..year) {
            val scubey = scubeyCheck(year, start)
            if (scubey != null) {
                return "$year\tNormal\t$start\t$scubey\n"
            }
        }
        return ""
    }

    private fun scubeyCheck(year: Int, start: Int = 1, skip: Int = 0) : Int? {
        var scub = year
        var i = start
        while (scub >= 0) {
            if (i == skip) i++
            scub -= Math.pow(i.toDouble(), 3.0).toInt()
            if (scub == 0) {
                return i
            }
            i++
        }
        return null
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
            "99\tNormal\t2\t4\n",
            Problem3.run(1, 99))
}