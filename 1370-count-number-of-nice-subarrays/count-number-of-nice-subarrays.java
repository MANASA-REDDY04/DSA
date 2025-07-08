class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k) - count(nums,k-1);
    }
    public static int count(int[] nums,int k){
        if(k < 0) return 0;
        int left = 0;
        int right = 0;
        int oddcnt = 0;
        int cnt = 0;
        int n = nums.length;
        while(right < n){
            if(nums[right] % 2 != 0) oddcnt++;
            while(oddcnt > k){
                if(nums[left] % 2 != 0) oddcnt--;
                left++;
            }
            cnt += right-left+1;
            right++;
        }
        return cnt;
    }
}