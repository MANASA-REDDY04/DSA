class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && maxIndex != nums.length-1 && maxIndex == i) return false; 
            int maxPossible = i+nums[i];
            maxIndex = Math.max(maxIndex,maxPossible);
        }
        return maxIndex >= nums.length-1;
    }
}