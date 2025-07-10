class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int currIndx = nums[i]-1;
            if(nums[i] != nums[currIndx]) swap(nums,i,currIndx);
            else i++;
        }
        for(i = 0; i < n; i++){
            if(nums[i] != i+1) return nums[i];
        }
        return n;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}