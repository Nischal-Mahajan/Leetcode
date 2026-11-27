class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSub=0;
        int left=0;
        int currentSub=maxSub;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(map.containsKey(ch)){
                map.remove(s.charAt(left));
                left++;
            }
            map.put(ch,1);
            currentSub=right-left+1;
            if(currentSub>maxSub){
                maxSub=currentSub;
            }

        }
        return maxSub;
    }
}