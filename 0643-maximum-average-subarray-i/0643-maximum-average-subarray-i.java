class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max_average=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double current_avg;
        current_avg=sum/k;
        max_average=current_avg;
        for(int i=k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            current_avg=sum/k;
            if(current_avg>max_average){
                max_average=current_avg;
            }
        }
        return max_average;  
    }
}