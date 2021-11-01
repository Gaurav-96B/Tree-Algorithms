
class Solution
{
    static ArrayList <Integer> verticalOrder(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        diagonalSum(root,0,map);
        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        Collections.sort(keys);
        for(int k: keys){
            for(int a: map.get(k)){
                ans.add(a);
            }
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
      diagonalSum(root.left, diagonal-1,map);
      diagonalSum(root.right, diagonal+1,map);
    }
    
}
