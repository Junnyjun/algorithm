fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val st1 =readLine() !!.toInt()
    print(factorial(st1))
}
fun factorial(n: Int): Int {
    return if (n in 0..1) 1 
    else  factorial(n - 1) * n
}