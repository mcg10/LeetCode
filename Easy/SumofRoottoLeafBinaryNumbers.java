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
    HashMap<Integer, String> myMap = new HashMap<>();
    public int sumRootToLeaf(TreeNode root) {
        helper(root, "");
        int answer = 0;
        for (int s : myMap.keySet()){
            answer += Integer.parseInt(myMap.get(s), 2); 
    }
        return answer;
    }
    private int i = 0;
    private void helper(TreeNode t, String path){
        if (t == null) return;
         if (t.left == null && t.right == null) {
            myMap.put(i, path + Integer.toString(t.val));
            i++;
            return;
        }
        helper(t.left, path + Integer.toString(t.val));
        helper(t.right, path + Integer.toString(t.val));
        }
    }
        
