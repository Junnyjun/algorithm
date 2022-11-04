class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean =matrix.flatMap { it.toList() }.contains(target)
}