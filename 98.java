/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        /// recursion
        return helper(root, null, null);
    }
    
    public boolean helper(TreeNode root, Integer a, Integer b){
        if (root==null){
            return true;
        }
        int val = root.val;
        if (a!=null && val<=a){
            return false;
        }
        if (b!=null && val>=b){
            return false;
        }
        if (!helper(root.left, a, val)){
            return false;
        }
        if (!helper(root.right, val, b)){
            return false;
        }
        return true;
    }
}