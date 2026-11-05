class Solution {
    int ans, max = 0;
    public int findBottomLeftValue(TreeNode root) {
        max = 0;
        dfs(root, 1);
        return ans;
    }
    void dfs(TreeNode root, int level) {
        if (root == null) return;

        if (level > max) {
            max = level;
            ans = root.val;
        }

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}