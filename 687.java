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
    int count;
    public int longestUnivaluePath(TreeNode root) {
        count=0;
        helper(root);
        return count;
    }
    
    public int helper(TreeNode node){
        if (node==null){
            return 0;
        }
        int a=0;
        int b=0;
        int left=helper(node.left);
        int right=helper(node.right);
            
        if (node.left!=null && node.left.val==node.val){
            a+=1+left;
        }
        if (node.right!=null && node.right.val==node.val){
            b+=1+right;
        }
        count=Math.max(a+b, count);
        return Math.max(a,b);
        
    }
}