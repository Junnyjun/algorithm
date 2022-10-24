class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
                if (matrix.size==0){
            return MutableList(0){0}
        }
        if (matrix.size==1){
            return matrix[0].toList()
        }
        val msize = matrix.size * matrix[0].size
        var a = List(0){0}
        val done: MutableMap<String, Int> = mutableMapOf("u" to 0, 
                                                         "d" to matrix.size-1, 
                                                         "l" to 0, 
                                                         "r" to matrix[0].size-1)
        var dir = "r"
        var cp = intArrayOf(0,0)
        while(true){
            if (a.size == msize){
                break
            }
            a = a.plus(when (dir){
                "r"->goRight(matrix, done, cp)
                "d"->goDown(matrix, done, cp)
                "l"->goLeft(matrix, done, cp)
                "u"->goUp(matrix, done, cp)
                else->goRight(matrix, done, cp)
            })
            dir = getNextDir(dir)
        }
        return a
    }
    fun goRight(matrix: Array<IntArray>, done: MutableMap<String, Int>, cp: IntArray): List<Int>{
        done["u"] = done["u"]!! + 1
        val l = matrix[cp[0]].slice(done["l"]!! .. done["r"]!!).toList()
        cp[1] = done["r"]!!
        return l
    }
    fun goLeft(matrix: Array<IntArray>, done: MutableMap<String, Int>, cp: IntArray): List<Int>{
        done["d"] = done["d"]!! - 1
        val l = matrix[cp[0]].slice(done["l"]!! .. done["r"]!!).toList().reversed()
        cp[1] = done["l"]!!
        return l
    }
    fun goDown(matrix: Array<IntArray>, done: MutableMap<String, Int>, cp: IntArray): List<Int>{
        done["r"] = done["r"]!! - 1
        val l = MutableList(0){0}
        for (i in cp[0]+1 .. done["d"]!!){
            l.add(matrix[i][cp[1]])
        }
        cp[0] = done["d"]!!
        return l
    }
    fun goUp(matrix: Array<IntArray>, done: MutableMap<String, Int>, cp: IntArray): List<Int>{
        done["l"] = done["l"]!! + 1
        val l = MutableList(0){0}
        for (i in done["u"]!! .. cp[0]-1){
            l.add(matrix[i][cp[1]])
        }
        cp[0] = done["u"]!!
        return l.reversed()
    }
    fun getNextDir(dir: String): String{
        return when (dir){
            "r"->"d"
            "d"->"l"
            "l"->"u"
            "u"->"r"
            else->"r"
        }
    }
    
}