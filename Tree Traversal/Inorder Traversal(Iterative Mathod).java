class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curr=root;
        while(!stack.isEmpty()||curr!=null)
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.peek();
            ans.add(curr.val);
            stack.pop();
            
            curr=curr.right;  
        }
        return ans;
       
    }
}
