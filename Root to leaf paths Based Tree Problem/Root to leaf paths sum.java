class Tree1
{
  static int sum=0;
	public static long treePathsSum(Node root)
    {
        String s1="";
        sum=0;
        treeRootToPath(root,s1);
        return sum;
	}
	public static void treeRootToPath(Node root,String s1)
	{
	  if(root==null) 
      {
          return;
      }
      
      if(root.left==null&&root.right==null)
      {
        s1=s1+String.valueOf(root.data);
        sum=sum+Integer.parseInt(s1);
        return;
      }
      treeRootToPath(root.left,s1+String.valueOf(root.data));
      treeRootToPath(root.right,s1+String.valueOf(root.data));
	}
}
