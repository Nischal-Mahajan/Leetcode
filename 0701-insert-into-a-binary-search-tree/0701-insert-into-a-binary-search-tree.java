/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
         if (root == null) {
            return new TreeNode(val);
        }

        attach(root,val);
        return root;
    }
    private void attach(TreeNode root,int key){
        if(root==null) return;
        if(root.val==key) return;
        if(root.val<key) {
            if(root.right==null){
                TreeNode t=new TreeNode(key);
                root.right=t;
            }
            else{
                attach(root.right,key);
            }
        }
        else{
            if(root.left==null){
                TreeNode t=new TreeNode(key);
                root.left=t;
            }
            else{
                attach(root.left,key);
            }
        }
    }
}