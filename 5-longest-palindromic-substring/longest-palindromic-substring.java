class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int ansLeft = 0;
        int ansRight = 0;
        for(int i = 0; i < n; i++){
            int left = i;
            int right = i;
            int len = 0;
            while(left >= 0 && right < n){
                len = right-left+1;
                if(s.charAt(left) == s.charAt(right)){
                    if(len > maxLen){
                        maxLen = len;
                        ansLeft = left;
                        ansRight = right;
                    }
                    left--;
                    right++;
                }
                else break;
            }
            left = i;
            int right2 = i+1;
            while(left >= 0 && right2 < n){
                len = right2-left+1;
                if(s.charAt(left) == s.charAt(right2)){
                    if(len > maxLen){
                        maxLen = len;
                        ansLeft = left;
                        ansRight = right2;
                    }
                    left--;
                    right2++;
                }
                else break;
            }
        }
        String ans = s.substring(ansLeft, ansRight+1);
        return ans;
    }
}