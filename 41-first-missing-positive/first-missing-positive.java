class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int currIndx = nums[i]-1;
            if(nums[i] > 0 && nums[i] < n &&  nums[i] != nums[currIndx] ) swap(nums,i,currIndx);
            else i++;
        }
        for(i = 0; i < n; i++){
            if(nums[i] != i+1) return i+1;
        }
        return n+1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}