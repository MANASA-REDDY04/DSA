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
    static List<Integer> li;
    public List<Integer> inorderTraversal(TreeNode root) {
        li = new ArrayList<>();
        inorder(root);
        return li;
    }
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);
    }
}