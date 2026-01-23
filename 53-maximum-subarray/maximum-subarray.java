class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int prev;
        int sum = 0;
        prev = nums[0];
        int max = prev;
        int curr;
        for(int i = 1; i < n; i++){
            curr = Math.max(prev+nums[i],nums[i]);
            max = Math.max(max,curr);
            prev = curr;
        }
        return max;
    }
}