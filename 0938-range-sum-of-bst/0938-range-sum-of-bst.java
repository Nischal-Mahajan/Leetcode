class Solution {
    private int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        sum=0;
        if(root.val<low) return rangeSumBST(root.right,low,high);
        else if(root.val>high) return  rangeSumBST(root.left,low,high);
        else{  
            sum+=root.val;
            sum+=rangeSumBST(root.right,low,high);
            sum+=rangeSumBST(root.left,low,high);
        } 
        return sum;
    }
    
}