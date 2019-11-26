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
    public List<Integer> postorder(Node root) {
        helper(root);
        Collections.reverse(res);
        return res;
    }
    void helper(Node root){
        if (root==null){
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        /// stack = 1
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            /// curr = 1
            for (Node child : curr.children){
                stack.push(child);
                /// stack = 3 2 4
            }
            res.add(curr.val);
            /// res = 1 4 2 3 6 5
        }
    }
}