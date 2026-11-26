class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++){
            if (k > 0 && nums[k] == nums[k - 1])continue;
            int fixer=nums[k];
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                List<Integer> temp = new ArrayList<>();
                if(fixer==-(nums[i]+nums[j])){
                    temp.add(nums[k]);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j + 1]) {
                            j--;
                    }
                    if(temp.size()!=0){
                    ans.add(temp);
                    }
                }
                else if(fixer>-(nums[i]+nums[j])){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return ans;        
    }
}