class Solution {
    static int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return findWays(n);
    }
    public static int findWays(int n){
        if(n <= 2){
            dp[n] = n;
            return n;
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = findWays(n-1) + findWays(n-2);
        return dp[n];
    }
}