class Solution {
    List<Integer>ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversalTree(root);
        return ans;
    }
    public void inorderTraversalTree(TreeNode root)
    {
       if(root==null) 
       {
           return;
       }
        inorderTraversalTree(root.left);
        ans.add(root.val);
        inorderTraversalTree(root.right);
    }
}
