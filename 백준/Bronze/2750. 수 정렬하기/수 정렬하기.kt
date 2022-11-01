fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val st1 =readLine() !!.toInt()

    val arr1 = ArrayList<Int>()
    for (i in 0 until st1){
        arr1.add(readLine().toInt())
    }
    arr1.distinct().sorted().forEach {
        println(it)
    }
}