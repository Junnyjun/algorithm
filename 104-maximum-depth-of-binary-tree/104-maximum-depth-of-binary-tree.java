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
    public int maxDepth(TreeNode root) {
    int depth = 0;
    Queue<TreeNode> q = new LinkedList<>();
    if(root == null)return depth;
    q.offer(root);
    while(!q.isEmpty()){
        int qSize = q.size();
        for (int i = 0; i < qSize; i++) {
            TreeNode cur = q.poll();
            if(cur.left != null)q.offer(cur.left);
            if(cur.right != null)q.offer(cur.right);
        }
        depth++;
    }
    return depth;
}
}