class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int maxSum = 0;
        int leftSum = 0;
        for(int i = 0; i < k; i++) leftSum += cardPoints[i];
        maxSum = Math.max(maxSum,leftSum);
        if(k == n) return maxSum;
        int right = n-1;
        int left = k-1;
        int rightSum = 0;
        while(left >= 0){
            leftSum -= cardPoints[left];
            rightSum += cardPoints[right];
            left--;
            right--;
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}