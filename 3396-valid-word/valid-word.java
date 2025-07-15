class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if (n < 3)
            return false;
        boolean vowel = false;
        boolean cons = false;
        word = word.toLowerCase();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
                return false;
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel = true;
                } else
                    cons = true;
            }
        }
        return vowel && cons;
    }
}