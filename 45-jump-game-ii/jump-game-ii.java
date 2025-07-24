class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int n = nums.length;
        int current_end = 0;
        int farthest = 0;
        for(int i = 0; i <= n-2; i++){
            farthest = Math.max(farthest,i+nums[i]);
            if(i == current_end){
                jumps++;
                current_end = farthest;
            }
        }
        return jumps;
    }
}