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
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        if(root == null) return ans;
        st.push(curr);
        ans.add(curr.val);
        while(!st.isEmpty()){
            if(curr.left != null){
                st.push(curr.left);
                ans.add(curr.left.val);
                curr = curr.left;
            }
            else{
                while(!st.isEmpty() && st.peek().right == null) st.pop();
                if(!st.isEmpty()){
                TreeNode temp = st.pop();
                curr = temp.right;
                st.push(curr);
                ans.add(curr.val);
                }
            }
        }
        return ans;
    }
    
}