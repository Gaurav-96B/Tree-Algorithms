/* Itertaive Preorder traversal==Level order traversal only differnce (in preorder we use stack and in level order traversal we use Queue)*/

static ArrayList<Integer> preorder(Node root)
    {
      ArrayList<Integer>ans=new ArrayList<>();
      if(root==null)
      {
          return ans;
      }
      Stack<Node>stack=new Stack<>();
      stack.push(root);
      while(!stack.isEmpty())
      {
          Node n=stack.pop();
          ans.add(n.data);
          if(n.right!=null)
          {
              stack.push(n.right);
          }
          if(n.left!=null)
          {
              stack.push(n.left);
          }
      }
      return ans;
    }
