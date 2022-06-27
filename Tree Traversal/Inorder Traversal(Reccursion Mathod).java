ArrayList<Integer> inOrder(Node root) {
      ArrayList<Integer>ans=new ArrayList<>();
      inorderTraversal(root,ans);
      return ans;
    }
    public void inorderTraversal(Node root,ArrayList<Integer>ans)
    {
        if(root==null)
        {
            return;
        }
        inorderTraversal(root.left,ans);
        ans.add(root.data);
        inorderTraversal(root.right,ans);
    }
