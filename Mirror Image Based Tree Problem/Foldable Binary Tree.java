class Tree
{
    boolean IsFoldable(Node node) 
	{ 
	    if(node==null)
	    {
	        return true;
	    }
	    return Foldable(node.left,node.right);
	} 
	boolean Foldable(Node left,Node right) 
	{
	   if(left==null&&right==null) 
	   {
	       return true;
	   }
	   if(left==null||right==null)
	   {
	       return false;
	   }
	   return Foldable(left.left,right.right)&&Foldable(left.right,right.left);
	}
}
