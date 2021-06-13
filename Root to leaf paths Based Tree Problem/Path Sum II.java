class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        pathSumValue(root,ans,curr,targetSum);
        return ans;
        
    }
    public void pathSumValue(TreeNode root,List<List<Integer>>ans,List<Integer>curr,int targetSum)
    {
        if(root==null)  
        {
          return;
        }
        if(root.left==null&&root.right==null&&targetSum-root.val==0)
        {
            curr.add(root.val);
            ans.add(new ArrayList<>(curr));
            curr.remove(curr.size()-1);
        }
        curr.add(root.val);
        pathSumValue(root.left,ans,curr,targetSum-root.val);
        pathSumValue(root.right,ans,curr,targetSum-root.val);
        curr.remove(curr.size()-1);
        
    }
    
}
