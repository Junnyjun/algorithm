/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        int rst = 0;
    public int goodNodes(TreeNode root) {
         if (root != null) {
            dfs(root, root.val);
        }
        return rst;
    }
        private void dfs(TreeNode node, int val) {

        val = Math.max(val, node.val);
        if (node.val >= val) {
            rst++;
        }

        if (node.right != null) {
            dfs(node.right, val);
        }

        if (node.left != null) {
            dfs(node.left, val);
        }
    }
}