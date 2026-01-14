class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // if not exist -> add
        // else check dist 
        // if dist return true
        // else update index
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i],i);
            else{
                int prev = hm.get(nums[i]);
                int dist = i - prev;
                if(dist <= k) return true;
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}