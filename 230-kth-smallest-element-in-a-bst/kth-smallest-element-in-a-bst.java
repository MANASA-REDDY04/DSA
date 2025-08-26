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
    static ArrayList<Integer> ans;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        if(root.left == null && root.right == null) return root.val;
        ans = new ArrayList<>();
        inorder(root);
        return ans.get(k-1);
    }
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
}