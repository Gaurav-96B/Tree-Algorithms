class Solution {
    List<Integer>ans=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrderTree(root);
        return ans;
    }
    public void postOrderTree(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        postOrderTree(root.left);
        postOrderTree(root.right);
        ans.add(root.val);
    }
}
