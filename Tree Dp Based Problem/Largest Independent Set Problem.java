class Solution {
    public int LISS(Node node){
        if(node==null)
        {
            return 0;
        }
        if(node.left==null&&node.right==null)
        {
            return 1;
        }
        
        int exclude=LISS(node.left)+LISS(node.right);
        int include=1;
        if(node.left!=null)
        {
           include=include+LISS(node.left.left)+LISS(node.left.right);
        }
        if(node.right!=null)
        {
           include=include+LISS(node.right.left)+LISS(node.right.right);
        }
        return Math.max(exclude,include);
    }
}
