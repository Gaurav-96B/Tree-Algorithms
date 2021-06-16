class Solution
{
    static ArrayList <Integer> levelOrder(Node node) 
    {
        if(node==null)
        {
            return null;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node newNode=q.peek();
            ans.add(newNode.data);
            q.poll();
            
            if(newNode.left!=null)
            {
                q.add(newNode.left);
            }
            if(newNode.right!=null)
            {
              q.add(newNode.right); 
            }
        }
        return ans;
    }
}
