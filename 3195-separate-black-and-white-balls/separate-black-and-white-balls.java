class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        int l = 0;
        long res = 0;
        for(int r = 0; r < n; r++){
            if(s.charAt(r) == '0'){
                res += (r-l);
                l++;
            }
        }
        return res;
    }
}