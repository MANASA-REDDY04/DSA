class Solution {
    public int subarraySum(int[] nums, int k) {
        // sum = 0
        // count = 0
        // if sum = k , count++
        // if sum-k exist in hm, count++
        // ret c
        long sum = 0;
        int count = 0;
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put(0L,1);
        for(int i: nums){
            sum += i;
            long diff = (sum - k);
            if(hm.containsKey(diff)) count += hm.get(diff);
            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
    // 0,1 | 1,1
    // sum: 1 | 0
    // diff: 1-0 = 1 | 
}