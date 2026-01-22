class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int[] hash = new int[101];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i]-k >= 0){
                count += hash[nums[i]-k];
            }
            if(nums[i]+k < 101){
                count += hash[nums[i]+k];
            }
            hash[nums[i]] += 1;
        }
        return count;
    }
}