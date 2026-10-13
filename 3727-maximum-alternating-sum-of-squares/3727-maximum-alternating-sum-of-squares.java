class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(arr);
        long ans = 0;
        int left = 0, right = n - 1;
        while (left < right) {
            ans += arr[right] - arr[left];
            left++;
            right--;
        }
        if (left == right) {
            ans += arr[left];
        }
        return ans;
    }
}
