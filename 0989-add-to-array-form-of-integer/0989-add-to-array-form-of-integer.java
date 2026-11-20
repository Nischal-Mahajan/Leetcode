class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            num[i] += k;
            k = num[i] / 10;
            num[i] = num[i] % 10;
        }

        for (int i = num.length - 1; i >= 0; i--) {
            ans.add(num[i]);
        }

        while (k > 0) {
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}