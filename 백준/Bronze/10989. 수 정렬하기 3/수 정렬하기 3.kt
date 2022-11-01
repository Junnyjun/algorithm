import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

  fun main() {

      val br = BufferedReader(InputStreamReader(System.`in`))
      val bw = BufferedWriter(OutputStreamWriter(System.out))

      val N = br.readLine().toInt()
      val array = IntArray(N)

      for (i in 0 until N) {
          array[i] = br.readLine().toInt()
      }

      br.close()

      array.sort()
  //    Arrays.sort(array)
  
      for (i in 0 until N) {
          bw.write(array[i].toString())
          bw.newLine()
      }
 
      bw.flush()
      bw.close()
  }