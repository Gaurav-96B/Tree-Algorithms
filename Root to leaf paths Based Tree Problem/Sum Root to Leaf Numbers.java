class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        String s1="";
        sum=0;
        treeRootToPath(root,s1);
        return sum;
        
    }
    public void treeRootToPath(TreeNode root,String s1)
	  {
	    if(root==null) 
      {
          return;
      }
      if(root.left==null&&root.right==null)
      {
        s1=s1+String.valueOf(root.val);
        sum=sum+Integer.parseInt(s1);
        return;
      }
      treeRootToPath(root.left,s1+String.valueOf(root.val));
      treeRootToPath(root.right,s1+String.valueOf(root.val));
	}
}
