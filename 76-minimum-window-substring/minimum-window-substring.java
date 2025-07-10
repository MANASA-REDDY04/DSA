class Solution {
    public String minWindow(String s, String t) {
          if (s == null || t == null || s.length() < t.length()) return "";
        HashMap<Character,Integer> hm = new HashMap<>();
        int m = t.length();
        for(int i = 0; i < m; i++){
            char ch = t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int n = s.length();
        int minlen = Integer.MAX_VALUE;
        int count = hm.size();
        int i = 0;
        int j = 0;
        String ans = "";
        while(j < n){
            char ch = s.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch) == 0) count--;
            }
            while(count == 0){
                if(j-i+1 < minlen){
                    minlen = j-i+1;
                    ans = s.substring(i,j+1);
                }
                if(hm.containsKey(s.charAt(i))){
                    char ci = s.charAt(i);
                    if(hm.get(ci) == 0) count++;
                    hm.put(ci,hm.get(ci)+1);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}