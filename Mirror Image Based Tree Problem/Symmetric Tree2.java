class GfG
{
    public static boolean isSymmetric(Node root)
    {
        if(root==null)
        {
            return true;
        }
        return SymmetricTree(root.left,root.right);
    }
    public static boolean SymmetricTree(Node left,Node right)
    {
       if(left==null&&right==null) 
       {
         return true;  
       }
       if(left==null||right==null)
       {
           return false;
       }
       return left.data==right.data&&SymmetricTree(left.left,right.right)&&SymmetricTree(left.right,right.left);
    }
}
