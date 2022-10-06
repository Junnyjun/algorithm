/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedArrayToBST(
        nums: IntArray, 
        low: Int = 0, 
        high: Int = nums.size - 1
    ): TreeNode? {
        if (low > high) return null

        val mid = low + (high - low) / 2;

        return TreeNode(nums[mid]).apply {
            left = sortedArrayToBST(nums, low, mid - 1)
            right = sortedArrayToBST(nums, mid + 1, high)
        }
    }
}