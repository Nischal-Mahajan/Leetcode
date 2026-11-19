class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        ArrayList<Integer> permutations = new ArrayList<>();
        boolean[] visited = new boolean[n];
        check(nums, ans, permutations, visited, n);
        return ans;
    }
    public static void check(int[] nums,ArrayList<List<Integer>> ans,ArrayList<Integer> permutations,boolean[]visited, int n) {
        if (permutations.size() == n) {
            ans.add(new ArrayList<>(permutations));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutations.add(nums[i]);
                check(nums, ans, permutations, visited, n);
                permutations.remove(permutations.size() - 1);
                visited[i] = false;
            }
        }
    }
}