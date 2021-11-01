class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
        Map<Integer,List<Integer>> map = new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        diagonalSum(root,0,map);
        for (Map.Entry<Integer,List<Integer>> entry:map.entrySet()) {
            List<Integer>value=entry.getValue();
            ans.addAll(value);
        }
        return ans;
      }
    public static void diagonalSum(Node root,int diagonal, Map<Integer, List<Integer>> map )
    {
      if(root==null) 
      {
          return;
      }
      map.putIfAbsent(diagonal,new ArrayList<>());
      map.get(diagonal).add(root.data);
      diagonalSum(root.left, diagonal + 1,map);
      diagonalSum(root.right, diagonal,map);
    }
}
