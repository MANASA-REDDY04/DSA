class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        while(n != 0){
            int res = sumSquares(n);
            if(res == 1) break;
            if(!li.isEmpty() && li.contains(res)) return false;
            li.add(res);
            n = res;
        }
        System.out.println(li);
        return true;
    }
    public static int sumSquares(int n){
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum = sum + (digit * digit);
            n/=10;
        }
        return sum;
    }
}