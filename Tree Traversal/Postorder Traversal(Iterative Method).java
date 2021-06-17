class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null)
        {
           return ans;
        }
        Stack<TreeNode>stack = new Stack<>();
        TreeNode prev = null;
        stack.push(root);
        while(!stack.empty())
        {
        TreeNode current  = stack.peek();
        if(prev == null || ( prev.left == current || prev.right == current ))
        {
        if(current.left != null) 
        {
            stack.push(current.left);
        }
        else if(current.right != null) 
        {
            stack.push(current.right);
        }
        }
        else if(prev==current.left)
        {
        if(current.right != null)
        {
        stack.push(current.right);
        }
        }
        else
        {
        ans.add(current.val);
        stack.pop();
        }
        prev = current;
        }
        return ans;
    }
}
