class Solution {
    public int minimumCost(int[] cost) {
        int minCost = 0;
        Arrays.sort(cost);
        reverseArray(cost);
        
        for(int i = 0; i < cost.length; i++){
            if((i+1)%3 != 0){
                minCost += cost[i];
            }
        }
        return minCost;
    }
     public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}