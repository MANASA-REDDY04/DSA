class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        HashSet<Integer> hs = new HashSet<>();

        for(int i : nums) hs.add(i);

        int maxLen = 0;
        for(int i : hs){
            if(hs.isEmpty()) return maxLen;
            if(!hs.contains(i-1)){
                int len = 1;
                int x = i;
                while(hs.contains(x+1)){
                    len++;
                    x++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}