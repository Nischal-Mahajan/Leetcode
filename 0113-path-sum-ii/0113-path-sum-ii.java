
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans, targetSum);
        return ans;
    }

    public void dfs(TreeNode root, List<Integer> arr,
                    List<List<Integer>> ans, int sum) {

        if (root == null) return;
        arr.add(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            ans.add(new ArrayList<>(arr));
        } else {
            dfs(root.left, arr, ans, sum);
            dfs(root.right, arr, ans, sum);
        }
        arr.remove(arr.size() - 1);
    }
}
