class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int j = 0;
        int i = 0;
        while(i < slen && j < tlen){
            char ch = s.charAt(i);
            while(j < tlen && t.charAt(j) != ch) j++;
            if(j < tlen && ch == t.charAt(j)){
                i++;
                j++;
            }
        }
        return i == slen;
    }
}