class Solution {
    public int brokenCalc(int startValue, int target) {
        if(startValue == target) return 0;
        int ops = 0;
        while(target > startValue){
            if(target % 2 == 0) target = target/2;
            else target++;
            ops++;
        }
        return ops+(startValue - target);
    }
}