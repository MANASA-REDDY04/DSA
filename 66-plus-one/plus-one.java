class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1] != 9){
            digits[n-1] += 1;
            return digits;
        }
        int[] res = new int[n+1];
        int curr = -1;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                curr = i;
                break;
            }
        }
        if(curr != -1){
            digits[curr] += 1;
            return digits;
        }
        Arrays.fill(res,0);
        res[0] = 1;
        return res;
    }
}