class Solution {
    public boolean canJump(int[] nums) {
        int maxindex=0;
        if(nums.length==1) return true;
        for(int i=0;i<nums.length;i++){
            if(maxindex<i){
                return false;
            }
            maxindex = Math.max(maxindex, i + nums[i]);
        }
        return true;
    }
}