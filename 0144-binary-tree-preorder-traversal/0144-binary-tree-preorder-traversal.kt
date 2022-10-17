class Solution {
    val ans = mutableListOf<Int>()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if(root != null) ans.add(root!!.`val`)
        if(root?.left != null) preorderTraversal(root!!.left)
        if(root?.right != null) preorderTraversal(root!!.right)
        return ans
    }
}