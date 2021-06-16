class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        List<Integer>curr=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            
            int size=q.size();
            while(size!=0)
            {
                TreeNode node=q.peek();
                curr.add(node.val);
                q.poll();
                if(node.left!=null)
                {
                   q.add(node.left);
                }
                if(node.right!=null)
                {
                  q.add(node.right); 
                }
                size--;
            }
            ans.add(new ArrayList<>(curr));
            curr.removeAll(curr);
        }
        return ans;
        
    }
}
