import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Int>()
    val arr = Array(100){ 0 }
    for(i in 0..8) {
        val a = br.readLine().toInt()
        list.add(a)
        arr[a] = i
    }
    val sum = list.sum()
    val array = Array(9) { i -> sum-list[i] }
    val result = mutableListOf<Int>()
    for(i in 0..8){
        if(arr[array[i]-100] > 0 ) {
            for (j in 0..8) {
                if (j != i && j != arr[array[i] - 100])
                    result.add(list[j])
            }
            break
        }
    }
    result.sort()
    result.forEach{
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
}