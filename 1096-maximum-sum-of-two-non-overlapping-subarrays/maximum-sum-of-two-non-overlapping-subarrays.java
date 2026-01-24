class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int[] prefixMaxSum = calculatePrefixMax(nums,nums.length);
        int[] suffixMaxSum = calculateSuffixMax(nums,nums.length);

        int ans = Math.max(solve(nums, prefixMaxSum, firstLen, suffixMaxSum, secondLen),
                            solve(nums, prefixMaxSum, secondLen, suffixMaxSum, firstLen));
        
        return ans;
    }
    public static int[] calculatePrefixMax(int[] nums,int n){
        int[] prefixMaxSum = new int[n];
        prefixMaxSum[0] = nums[0];
        int curr = nums[0];
        for(int i = 1; i < n; i++){
            curr = Math.max(curr+nums[i],nums[i]);
            prefixMaxSum[i] = Math.max(curr,prefixMaxSum[i-1]);
        }
        return prefixMaxSum;
    }
    public static int[] calculateSuffixMax(int[] nums,int n){
        int[] suffixMaxSum = new int[n];
        suffixMaxSum[n-1] = nums[n-1];
        int curr = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            curr = Math.max(curr+nums[i],nums[i]);
            suffixMaxSum[i] = Math.max(curr, suffixMaxSum[i+1]);
        }
        return suffixMaxSum;
    }
    public static int solve(int[] nums, int[] prefix, int firstLen, int[] suffix, int secondLen){
        int n = nums.length;
        int[] prefixFirst = new int[n];
        int[] suffixSecond = new int[n];

        for(int i = 0; i < n; i++){
            int start = i - firstLen + 1;
            if(i >= firstLen-1){
                prefixFirst[i] = prefix[i] - (start > 0? prefix[start-1] : 0);
            }
            if(i > 0) prefixFirst[i] = Math.max(prefixFirst[i],prefixFirst[i-1]);
        }
        for(int i = n-1; i >= 0; i--){
            int end = i + secondLen - 1;
            if(i <= n - secondLen){
                suffixSecond[i] = suffix[i] - (end < n-1 ? suffix[end+1] : 0);
            }
            if(i < n-1) suffixSecond[i] = Math.max(suffixSecond[i],suffixSecond[i+1]);
        }
        int ans = 0;
        for(int i = 0; i < n-1; i++){
            ans = Math.max(prefixFirst[i]+suffixSecond[i+1],ans);
        }
        return ans;
    }
}