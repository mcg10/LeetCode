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
    public int maxLevelSum(TreeNode root) {
      ArrayList<Integer> list = new ArrayList<>();
      levelOrder(root, list);
      int max = 0;
      int index = 1;
      int answer = 0;
      for (Integer s : list){
          if (max < s){
              max = s;
              answer = index;
          }
          index++;
      }
        return answer;
    }
    private void levelOrder(TreeNode t, ArrayList<Integer> list){
        if (t == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(t);
        while (! q.isEmpty()){
            int count = q.size();
            if (count == 0) break;
            int sum = 0;
            while (count > 0){
                TreeNode node = q.peek();
                sum += node.val;
                q.remove();
                if (node.left != null){
                  q.add(node.left);  
                }
                if (node.right != null){
                    q.add(node.right);
                }
                count--;
            }
            list.add(sum);
        }
    }
}
