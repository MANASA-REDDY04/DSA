import java.util.*;
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->{
            if(a[0] != b[0]) return b[0]-a[0];
            else return b[1]-a[1];
        });
        for(int i = 0; i < arr.length; i++){
            pq.offer(new int[]{Math.abs(x-arr[i]),i});
            if(pq.size() > k) pq.poll();
        }
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(arr[pq.poll()[1]]);
        }
        Collections.sort(ans); 
        return ans;
    }
}