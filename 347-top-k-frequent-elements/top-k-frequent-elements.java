class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            pq.offer(new int[]{e.getKey(),e.getValue()});
            if(pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        for(int i = 0; i < k ; i++){
            res[i] = pq.poll()[0];
        }
        return res;
    }
}