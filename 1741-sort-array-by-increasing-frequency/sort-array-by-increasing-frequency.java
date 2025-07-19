class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[0] != b[0]) return a[0]-b[0];
            else return b[1]-a[1];
        });
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            pq.offer(new int[]{e.getValue(),e.getKey()});
        }
        int indx = 0;
        while(!pq.isEmpty()){
            int[] pair = pq.poll();
            for(int x = 0; x < pair[0]; x++) nums[indx++] = pair[1]; 
        }
        return nums;
    }
}