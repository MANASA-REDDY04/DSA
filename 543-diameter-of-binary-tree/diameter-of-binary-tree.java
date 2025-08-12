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
    static int dia;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        dia = 0;
        maxDiameter(root);
        return dia;
    }
    public static int maxDiameter(TreeNode root){
        if(root == null) return 0;
        int left = maxDiameter(root.left);
        int right = maxDiameter(root.right);
        dia = Math.max(dia,left+right);
        return Math.max(left,right)+1;
    }
}