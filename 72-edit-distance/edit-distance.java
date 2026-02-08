class Solution {
    public int minDistance(String word1, String word2) {
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
        int n = s1.length;
        int m = s2.length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 && j == 0) dp[i][j] = 0;
                else if(i == 0){
                    dp[i][j] = j;
                }
                else if(j == 0){
                    dp[i][j] = i;
                }
                else{
                    int val = Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                    if(s1[j-1] == s2[i-1]) dp[i][j] = dp[i-1][j-1];
                    else dp[i][j] = val+1;
                }
            }
        }
        return dp[m][n];
    }
}