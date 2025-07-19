class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i = 0; i < n; i++){
            int dist = Math.abs((int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2));
            pq.offer(new int[]{dist,i});
            if(pq.size() > k) pq.poll();
        }
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            int[] pair = pq.poll();
            res[i][0] = points[pair[1]][0];
            res[i][1] = points[pair[1]][1];
        }
        return res;
    }
}