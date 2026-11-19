class Solution {
    public int maxSubArray(int[] nums) {
        int runningSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            runningSum+=nums[i];
            if(runningSum>maxSum){
                maxSum=runningSum;
            }
            if(runningSum<0){
                runningSum=0;
            }
        }
        return maxSum;

    }
}