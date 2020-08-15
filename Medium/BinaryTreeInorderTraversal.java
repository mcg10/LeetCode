class Solution {
    ArrayList answer = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return answer;
    }
    private void inOrder (TreeNode t){
        if (t == null) return;
        inOrder(t.left);
        answer.add(t.val);
        inOrder(t.right);
    }
}
