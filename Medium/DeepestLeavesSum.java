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
    public int answer = 0;
    public int deepestLeavesSum(TreeNode root) {
        int helper = maxDepth(root);
        traverse(root, 1, helper);
        return answer;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
        
    private void traverse(TreeNode t, int level, int maxlevel){
        if (t == null) return;
        if (level == maxlevel){
            answer += t.val;
        }
        else{
            traverse(t.right, level+1, maxlevel);
            traverse(t.left, level+1, maxlevel);
        }
    }
}
