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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        helper(root);
        return root;
    }
    private void helper(TreeNode t){
        if (t == null) return;
      
        TreeNode left = t.left;
        TreeNode right = t.right;
        t.left = right;
        t.right = left;
        helper(t.left);
        helper(t.right);
    }
}
