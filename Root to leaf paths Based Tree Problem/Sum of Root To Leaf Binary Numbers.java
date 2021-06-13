class Solution {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        String s1="";
        sum=0;
        sumOfBinaryNumber(root,s1);
        return sum;
        
    }
    public void sumOfBinaryNumber(TreeNode root,String s1)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            s1=s1+String.valueOf(root.val);
            sum=sum+Integer.parseInt(s1,2);
            return;
            
        }
        sumOfBinaryNumber(root.left,s1+String.valueOf(root.val));
        sumOfBinaryNumber(root.right,s1+String.valueOf(root.val));
    }
}
