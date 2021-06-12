class Solution  
{ 
     boolean isIsomorphic(Node n1, Node n2)  
    { 
        if(n1==null&&n2==null)
        {
            return true;
        }
        if(n1==null||n2==null)
        {
            return false;
        }
        return n1.data==n2.data&&isIsomorphic(n1.left,n2.left)&&isIsomorphic(n1.right,n2.right)
                ||n1.data==n2.data&&isIsomorphic(n1.left,n2.right)&&isIsomorphic(n1.right,n2.left);
    }
    
    
}    
