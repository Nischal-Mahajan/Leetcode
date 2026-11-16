class Solution {
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        ArrayList<TreeNode> ans=new ArrayList<>();
        inorder(root,ans);
        Collections.reverse(ans);
        int sum=0;
        for(int i=0;i<ans.size();i++){
            int val=ans.get(i).val;
            sum += val;
            ans.get(i).val = sum;
        }
        return root;
    }
    public void inorder(TreeNode root,ArrayList<TreeNode> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
    }
}