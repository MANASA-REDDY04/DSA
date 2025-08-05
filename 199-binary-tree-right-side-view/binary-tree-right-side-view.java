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
    static List<Integer> ans;
    public List<Integer> rightSideView(TreeNode root) {
     ans  = new ArrayList<>();
     getView(root,0);
     return ans;
    }
    public static void getView(TreeNode root,int level){
        if(root == null) return;
        if(ans.size() == level){
            ans.add(root.val);
        }

        getView(root.right,level+1);
        getView(root.left,level+1);
    }
}