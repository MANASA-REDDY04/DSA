class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> li = new ArrayList<>();
        int n = intervals.length;
        // left part        
        int i = 0;
        while(i < n && intervals[i][1] < newInterval[0]){
            li.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        // overlapping part
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        li.add(new int[]{newInterval[0],newInterval[1]});

        // right part
        while(i < n){
             li.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        int[][] ans = new int[li.size()][2];
        for(i = 0; i < li.size(); i++){
            ans[i][0] = li.get(i)[0];
            ans[i][1] = li.get(i)[1];
        }
        return ans;
    }
}