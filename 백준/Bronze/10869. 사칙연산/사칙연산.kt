import java.util.*

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val arr = ArrayList<Int>()
    val st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        arr.add(st.nextToken().toInt())
    }
    println("${arr[0] +arr[1]}")
    println("${arr[0] -arr[1]}")
    println("${arr[0] *arr[1]}")
    println("${arr[0] /arr[1]}")
    println("${arr[0] %arr[1]}")
}