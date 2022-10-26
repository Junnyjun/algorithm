fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val data1 = readLine()
    val data2 = readLine()

    println("${data1.toInt() * data2[2].toString().toInt()}")
    println("${data1.toInt() * data2[1].toString().toInt()}")
    println("${data1.toInt() * data2[0].toString().toInt()}")
    println("${data1.toInt() * data2.toInt()}")
}