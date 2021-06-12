class Tree
{
     ArrayList<Integer> Kdistance(Node root, int k)
     {
         ArrayList<Integer>a=new ArrayList<>();
         KdistanceNode(root,k,a);
         return a;
     }
     public void  KdistanceNode(Node root,int k,ArrayList<Integer>a) 
     {
       if(root==null) 
       {
           return;
       }
       if(k--==0)
       {
         a.add(root.data); 
       }
       KdistanceNode(root.left,k,a);
       KdistanceNode(root.right,k,a);
     }
}
