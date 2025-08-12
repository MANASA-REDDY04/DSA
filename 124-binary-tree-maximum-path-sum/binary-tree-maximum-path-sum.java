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
    static int sum;
    public int maxPathSum(TreeNode root) {
        sum = Integer.MIN_VALUE;
        findSum(root);
        return sum;
    }
    public static int findSum(TreeNode root){
        if(root == null) return 0;
        int left = findSum(root.left);
        int right = findSum(root.right);
        left = left < 0? 0: left;
        right = right<0? 0:right;
        sum = Math.max(sum,left+right+root.val);
        return root.val + Math.max(left,right);
    }
}