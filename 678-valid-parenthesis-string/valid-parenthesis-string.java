class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int minOpen = 0;
        int maxOpen = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                minOpen++;
                maxOpen++;
            }else if(ch == ')'){
                minOpen--;
                maxOpen--;
            }else{
                minOpen--; // )
                maxOpen++; // (
            }
            if(maxOpen < 0) return false;
            if(minOpen < 0) minOpen = 0;
        }
        return minOpen == 0; // more opens
    }
}