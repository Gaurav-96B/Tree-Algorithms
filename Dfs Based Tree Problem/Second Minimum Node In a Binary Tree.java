class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer>a=new TreeSet<>();
        findMinValue(root,a);
        int i=0;
        for(Integer ans:a){
            if(i==1){
            return ans;
            }
            i++;
        }
        return -1;
    }
    public void findMinValue(TreeNode root,Set<Integer>a)
    {
        if(root==null)
        {
            return;
        }
        a.add(root.val);
        findMinValue(root.left,a);
        findMinValue(root.right,a);
        return;    
    }
}
      
