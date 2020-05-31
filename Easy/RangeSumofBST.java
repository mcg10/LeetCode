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
    public int rangeSumBST(TreeNode root, int L, int  R) {
        inOrder(root, L, R);
        return answer;
    }
    public void inOrder(TreeNode t, int L, int R){
        if (t!= null){
            inOrder(t.left, L, R);
            if (t.val >= L && t.val<= R) {
                answer += t.val;
            }
            inOrder(t.right, L, R);
        }
    }
}
