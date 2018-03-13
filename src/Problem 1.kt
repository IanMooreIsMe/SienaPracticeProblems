import kotlin.test.assertEquals

object Problem1 {
    fun run(value: Int) : String {
        return "$value ${icv(value, 0)}"
    }

    private fun icv(value: Int, depth: Int) : Int {
        if (value == 1) return depth
        return icv(if (value.rem(2) == 0) value / 2 else value * 3 + 1, depth + 1)
    }
}

fun main(args: Array<String>) {
    assertEquals("2017 68", Problem1.run(2017))
    assertEquals("7 16", Problem1.run(7))
}