class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] != i && nums[i] != n){
                swap(nums,i,nums[i]);
            }else{
                i++;
            }
        }
        for(i = 0; i < n; i++){
            if(i != nums[i]) return i;
        }
        return n;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}