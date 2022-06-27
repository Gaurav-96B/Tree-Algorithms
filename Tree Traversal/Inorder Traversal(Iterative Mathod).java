 ArrayList<Integer> inOrder(Node root) {
      ArrayList<Integer>ans=new ArrayList<>();
      if(root==null)  
      {
        return ans; 
      }
      Stack<Node>stack=new Stack<>();
      Node curr=root;
      while(!stack.isEmpty()||curr!=null)
      {
          if(curr!=null)
          {
              stack.push(curr);
              curr=curr.left;
          }
          else
          {
              curr=stack.pop();
              ans.add(curr.data);
              curr=curr.right;
          }
      }
      return ans;
     
    }
