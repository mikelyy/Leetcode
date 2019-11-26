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
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        /// stack = 1 null 3 2 4 null 5 6
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            /// curr = 1 
            /// curr = null
            /// curr = 3
            for (int i=curr.children.size()-1; i>=0; i--){
                Node temp = curr.children.get(i);
                stack.push(temp);
            }
            res.add(curr.val);
        }
    }
}