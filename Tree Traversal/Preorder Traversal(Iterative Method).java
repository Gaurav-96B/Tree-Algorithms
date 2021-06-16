/* Itertaive Preorder traversal==Level order traversal only differnce (in preorder we use stack and in level order traversal we use Queue)*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode node=stack.peek();
            ans.add(node.val);
            stack.pop();
            
            if(node.right!=null)
            {
                stack.push(node.right);
            }
            if(node.left!=null)
            {
               stack.push(node.left);
            }  
        }
        return ans;
        
    }
   
}
