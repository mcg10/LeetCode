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
    public ArrayList<Integer> answer = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverse(root1);
        traverse(root2);
        Collections.sort(answer);
        return answer;
    }
    private void traverse(TreeNode t){
        if (t == null) return;
        answer.add(t.val);
        traverse(t.left);
        traverse(t.right);
    }
}
