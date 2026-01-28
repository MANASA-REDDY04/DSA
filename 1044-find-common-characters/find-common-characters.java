class Solution {
    public List<String> commonChars(String[] words) {
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        int n = words.length;
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            char arr[] = words[i].toCharArray();
            if(i == 0){
                for(char j: arr) hash1[j-'a']++;
            }
            else{
                for(char j: arr) hash2[j-'a']++;
                for(int k = 0; k < 26; k++){
                    if(hash1[k] != hash2[k])
                        hash1[k] = Math.min(hash1[k],hash2[k]);
                }
                boolean isCommon = false;
                for(int k = 0; k < 26; k++){
                    if(hash1[k] != 0){
                        isCommon = true;
                        break;
                    }
                }
                if(!isCommon) return ans;
                Arrays.fill(hash2,0);
            }
        }
        for(int i = 0; i < 26; i++){
            while(hash1[i] != 0){
                char ch = (char)(i+'a');
                ans.add(ch+"");
                hash1[i]--;
            }
        }
        return ans;
    }
}