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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        TreeNode answer = new TreeNode(list.get(0));
        TreeNode front = answer;
        for (int i = 1; i < list.size(); i++){
            answer.right = new TreeNode(list.get(i));
            answer = answer.right;
        }
        return front;
    }
    private void inOrder(TreeNode t, ArrayList<Integer> list){
        if (t!=null){
            inOrder(t.left, list);
            list.add(t.val);
            inOrder(t.right, list);
        }
    }
}
