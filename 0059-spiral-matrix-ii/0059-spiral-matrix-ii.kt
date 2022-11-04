class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        val result = Array(n) { IntArray(n) {1} }

        var t = 0
        var l = 0
        var b = n - 1
        var r = n - 1
        var dir = 0
        var counter = 0
        while (t <= b && l <= r) {
            if (dir == 0) {
                for (i in l until r + 1) {
                    counter++
                    result[l][i] = counter
                }
                t++
            } else if (dir == 1) {
                for (i in t until b + 1) {
                    counter++
                    result[i][r] = counter
                }
                r--
            } else if (dir == 2) {
                for (i in r downTo l) {
                    counter++
                    result[b][i] = counter
                }
                b--
            } else if (dir == 3) {
                for (i in b downTo t) {
                    counter++
                   result[i][l] = counter 
                }
                l++
            }
            dir = (dir + 1) % 4
            
        }
        return result

    }
}