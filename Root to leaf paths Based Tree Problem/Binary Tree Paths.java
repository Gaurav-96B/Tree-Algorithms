class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        String s1="";
        printRootToLeafPath(root,s1,ans);
        return ans;
        
    }
    public void printRootToLeafPath(TreeNode root,String s1,List<String>ans) 
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            s1=s1+String.valueOf(root.val);
            ans.add(s1);
            
        }
        printRootToLeafPath(root.left,s1+String.valueOf(root.val)+"->",ans);
        printRootToLeafPath(root.right,s1+String.valueOf(root.val)+"->",ans);

    }
}
