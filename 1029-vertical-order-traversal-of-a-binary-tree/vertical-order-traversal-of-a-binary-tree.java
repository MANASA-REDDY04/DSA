/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static  List<List<Integer>> res;
    static PriorityQueue<int[]> pq;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        res = new ArrayList<>();
        if(root == null) return res;
        pq = new PriorityQueue<>(
            (a,b) -> a[0] != b[0]? a[0]-b[0] :
                     a[1] != b[1]? a[1]-b[1]:
                     a[2] - b[2]
        );
        preorder(root,0,0);
        while(!pq.isEmpty()){
            Integer prevCol = null;
List<Integer> currList = new ArrayList<>();

while (!pq.isEmpty()) {
    int[] node = pq.poll();
    int col = node[0];
    int val = node[2];

    if (prevCol == null || col != prevCol) {
        if (prevCol != null) { 
            res.add(currList); 
        }
        currList = new ArrayList<>();
        prevCol = col;
    }
    currList.add(val);
}

// Add the last column's list
if (!currList.isEmpty()) {
    res.add(currList);
}
        }
        System.out.println(pq);
        return res;
    }
    public static void preorder(TreeNode root,int row,int col){
        if(root == null) return;
        pq.offer(new int[]{col,row,root.val});
        preorder(root.left,row+1,col-1);
        preorder(root.right,row+1,col+1); 
    }
}