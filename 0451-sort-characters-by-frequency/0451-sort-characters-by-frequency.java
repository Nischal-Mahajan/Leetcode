class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        String result = "";
        for (int k = 0; k < s.length(); k++) {
            int max = 0;
            int index = 0;
            for (int i = 0; i < 256; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }
            for (int j = 0; j < max; j++) {
                result += (char)index;
            }
            freq[index] = 0;
        }
        return result;
    }
}