	int countNonLeafNodes(Node root) {
	   if(root==null)
	   {
	       return 0;
	   }
	   Queue<Node>queue=new LinkedList<>();
	   queue.add(root);
	   int count=0;
	   while(!queue.isEmpty())
	   {
	       int size=queue.size();
	       while(size!=0)
	       {
	           Node node=queue.peek();
	           queue.poll();
	           if(node.left!=null||node.right!=null)
	           {
	             count++;
	           }
	           if(node.left!=null)
	           {
	               queue.add(node.left);
	           }
	           if(node.right!=null)
	           {
	               queue.add(node.right);
	           }
	           size--;
	       }
	   }
	   return count;
	}
