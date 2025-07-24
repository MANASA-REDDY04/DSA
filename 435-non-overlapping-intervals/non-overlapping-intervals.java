class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int count = 0;
        int end_time = arr[0][1];
        for(int i = 1; i < n; i++){
            if(arr[i][0] >= end_time){
                end_time = arr[i][1];
            }else{
                count++;
            }
        }
        return count;
    }
}