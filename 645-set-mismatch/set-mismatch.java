class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int currIndx = nums[i]-1;
            if(nums[i] != nums[currIndx]){
                swap(nums,i,currIndx);
            }else{
                i++;
            }
        }
        for(i = 0; i < n; i++){
            if(nums[i] != i+1) return new int[]{nums[i],i+1};
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}