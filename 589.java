/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        helper(root);
        return res;
    }
    
    void helper(Node root){
        if (root==null){
            return;
        }
        res.add(root.val);
        /// res = 1
        for (Node child : root.children){
            /// child = 3 2 4
            helper(child);
            /// res = 1 3 5 6 2 4
        }
    }
}