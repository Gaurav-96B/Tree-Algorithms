class Tree{
    public ArrayList<ArrayList<Integer>> Paths(Node root){
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>curr=new ArrayList<>();
        rootToLeavePath(root,curr,ans);
        return ans;
        
    }
    public void rootToLeavePath(Node root,ArrayList<Integer>curr,ArrayList<ArrayList<Integer>>ans)
    {
      if(root==null)  
      {
          return;
      }
      if(root.left==null&&root.right==null)
      {
        curr.add(root.data);
        ans.add(new ArrayList<>(curr));
        curr.remove(curr.size()-1);
        return;

      }
        curr.add(root.data);
        rootToLeavePath(root.left,curr,ans);
        rootToLeavePath(root.right,curr,ans);
        curr.remove(curr.size()-1);
        
      
    }
    
}
