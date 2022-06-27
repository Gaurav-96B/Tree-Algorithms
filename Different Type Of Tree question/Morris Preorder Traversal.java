static ArrayList<Integer> preorder(Node root)
    {
     ArrayList<Integer>ans=new ArrayList<>();
      if(root==null)
      {
          return ans;
      }
      Node curr=root;
      while(curr!=null)
      {
          if(curr.left==null)
          {
              ans.add(curr.data);
              curr=curr.right;
          }
          else
          {
              Node prev=curr.left;
              while(prev.right!=null&&prev.right!=curr)
              {
                prev=prev.right;  
              }
              if(prev.right==null)
              {
                  prev.right=curr;
                  ans.add(curr.data);
                  curr=curr.left;
              }
              else
              {
                  prev.right=null;
                  curr=curr.right;
              }
          }
      }
      return ans;
    }
