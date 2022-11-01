import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

var n: Int = 0
var col: IntArray = intArrayOf()
var answer: Int = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    n = readLine().toInt()
    col = IntArray(n)

    for (i in 0 until n) {
        col[0] = i
        nQueen(i, 0)
    }

    println(answer)
}

fun nQueen(x: Int, y: Int) {
    for (dy in 0 until y)
        if (col[dy] == x || abs(x - col[dy]) == y - dy) return

    if (n - 1 == y) {
        answer++
        return
    }

    for (i in 0 until n) {
        col[y + 1] = i
        nQueen(i, y + 1)
    }
}