class Solution {
    public int evalTree(Node root) {
        return evaluateTree(root);
    }
    public int evaluateTree(Node root)
    {
      if(root==null) 
      {
          return 0;
      }
      if(root.left==null&&root.right==null)
      {
         return Integer.parseInt(root.data);
      }
      if(root.data.equals("+"))
      {
         return  evaluateTree(root.left)+evaluateTree(root.right);
      }
      if(root.data.equals("-"))
      {
         return evaluateTree(root.left)-evaluateTree(root.right);
      }
      if(root.data.equals("*"))
      {
         return  evaluateTree(root.left)*evaluateTree(root.right);
      }
      else
      {
        return  evaluateTree(root.left)/evaluateTree(root.right);
      }
    }
}
