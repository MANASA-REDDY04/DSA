class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int l = 0;
        int r = 0;
        while(r < n){
            int count = 1;
            while(r+1 < n && nums[r] == nums[r+1]){
                r++;
                count++;
            }
            count = Math.min(2,count);
            for(int x = 0; x < count; x++){
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}