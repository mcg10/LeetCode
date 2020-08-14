class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int max = root.val;
        return dfs(root, max);
    }
    public int dfs(TreeNode t, int max){
        int count = 0;
        if (t.val >= max) {
            max = t.val;
            count++;
        }
        if (t.left != null) {
            count += dfs(t.left, max);
        }
        
        if (t.right != null) {
            count += dfs(t.right, max);
        }
        
        return count;
    }
}
