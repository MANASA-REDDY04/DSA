class Solution {
    public int numberOfSubstrings(String s) {
                int n = s.length();
        int a = -1;
        int b = -1;
        int c = -1;
        int min = n;
        int j = 0;
        int count = 0;
        while(j < n){
            char ch = s.charAt(j);
            if(ch == 'a') a = j;
            else if(ch == 'b') b = j;
            else if(ch == 'c') c = j;
            if(a != -1 && b != -1 && c != -1){
                min = Math.min(a,b);
                min = Math.min(min,c);
                            count += (min+1);
            }
            j++;
        }
        return count;
    }
}