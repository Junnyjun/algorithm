fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val st1 = readLine()!!.toInt()
    var str2 = ArrayList<String>()

    for (i in 0 until st1) {
        str2.add(readLine().toString())
    }

    // str2 단어 기준으로 정렬

    str2.distinct().sortedWith(compareBy({it.length},{it})).forEach { println(it) }
}
