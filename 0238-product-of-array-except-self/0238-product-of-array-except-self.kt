class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val runningProdLeft = listOf(1)+nums.runningReduce{prod, it -> prod*it}+listOf(1)
        val runningProdRight = listOf(1)+nums.reversed().toIntArray().runningReduce{prod, it -> prod*it}.reversed()+listOf(1)
        return (0..nums.lastIndex).map{runningProdLeft[it]*runningProdRight[it+2]}.toIntArray()
    }
}

// Because leetcode still has Kotlin from the stone ages (seriously 1.3???)
public inline fun IntArray.runningReduce(operation: (acc: Int, Int) -> Int): List<Int> {
    if (isEmpty()) return emptyList()
    var accumulator = this[0]
    val result = ArrayList<Int>(size).apply { add(accumulator) }
    for (index in 1 until size) {
        accumulator = operation(accumulator, this[index])
        result.add(accumulator)
    }
    return result
}