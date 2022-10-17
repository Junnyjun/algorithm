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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var resultList = mutableListOf<Int>()
        inOrder(root, resultList)
        return resultList
    }
    
    fun inOrder(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) return
        
        inOrder(root.left, list)
        list.add(root.`val`)
        inOrder(root.right, list)
    }
}