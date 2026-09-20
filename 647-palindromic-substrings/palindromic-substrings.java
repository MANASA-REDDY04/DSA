class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            int left = i;
            int right = i;
            while(left >= 0 && right < n){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                    count++;
                }
                else break;
            }
            left = i;
            int right2 = i+1;
            while(left >= 0 && right2 < n){
                if(s.charAt(left) == s.charAt(right2)){
                    left--;
                    right2++;
                    count++;
                }
                else break;
            }
        }
        return count;
    }
}