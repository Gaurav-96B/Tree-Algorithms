class GFG
{
    int sum=0;
    static int getMaxSum(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left==null&&node.right==null)
        {
            return node.data;
        }
        
        int excludesum=getMaxSum(node.left)+getMaxSum(node.right);
        int includesum=node.data;
        if(node.left!=null)
        {
           includesum=includesum+getMaxSum(node.left.left)+getMaxSum(node.left.right);
        }
        if(node.right!=null)
        {
           includesum=includesum+getMaxSum(node.right.left)+getMaxSum(node.right.right);
        }
        return Math.max(excludesum,includesum);
    }
}
