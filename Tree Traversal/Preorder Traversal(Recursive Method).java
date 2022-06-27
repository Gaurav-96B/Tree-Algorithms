static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    static void preorder(Node root,ArrayList<Integer>ans)
    {
        if(root==null)
        {
            return;
        }
        ans.add(root.data);
        preorder(root.left,ans);
        preorder(root.right,ans);
        
    }
    
