class Solution
{
    static class Pair{
        Node root;
        int hd;
        Pair(Node node,int hd){
            this.hd = hd;
            this.root = node;
        }
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            Node temp_node = temp.root;
            int hd = temp.hd;
            map.putIfAbsent(hd,new ArrayList<Integer>());
            map.get(hd).add(temp_node.data);
            if(temp_node.left!=null){
                queue.add(new Pair(temp_node.left,hd-1));
            }
            if(temp_node.right!=null){
                queue.add(new Pair(temp_node.right,hd+1));
            }
            
        }
        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        Collections.sort(keys);
        for(int k: keys){
            for(int a: map.get(k)){
                ans.add(a);
            }
        }
        return ans;
    }
  
}
