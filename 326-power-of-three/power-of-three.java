class Solution {
    public boolean isPowerOfThree(int n) {
        int maxi = (int)(Math.pow(3,19));
        if(n <= 0) return false;
        if(maxi % n == 0) return true;
        return false; 
    }
}