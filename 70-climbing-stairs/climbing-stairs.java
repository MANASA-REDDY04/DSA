class Solution {
    static int[] dp;
    public int climbStairs(int n) {
        if(n <= 2) return n;
        dp = new int[3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            int x = dp[1] + dp[2];
            dp[1] = dp[2];
            dp[2] = x;
        }
        return dp[2];
    }
}