class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int maxArea = 0;
        while(i < j){
            int minHeight = Math.min(height[i],height[j]);
            int width = j-i;
            maxArea = Math.max(maxArea, minHeight*width);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}