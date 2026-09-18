class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> hs = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i <= n-2; i++){
            HashSet<Integer> hs2 = new HashSet<>();
            for(int j = i+1; j < n; j++){
                int third = -(nums[i]+nums[j]);
                if(hs2.contains(third)){
                    List<Integer> ls = Arrays.asList(nums[i],nums[j], third);
                    ls.sort(null);
                    hs.add(ls);
                }
                 hs2.add(nums[j]);
            }
        }
        List<List<Integer>> res = new ArrayList<>(hs);
        return res;
    }
}