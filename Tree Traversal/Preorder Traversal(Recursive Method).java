class Solution {
    List<Integer>ans=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return ans;
    }
    public void preOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        ans.add(root.val);
        preOrder(root.left);
        preOrder(root.right); 
    }
   
}
