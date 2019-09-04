class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return mirror(root.left, root.right);
    }
    
    public boolean mirror(TreeNode root1, TreeNode root2){
        if (root1==null && root2==null){
            return true;
        }
        if (root1==null || root2==null){
            return false;
        }
        if (root1.val==root2.val){
            if (mirror(root1.right, root2.left) && mirror(root1.left, root2.right)){
                return true;
            }
        }
        return false;
    }
}