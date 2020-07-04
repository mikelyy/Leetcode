/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node cur = head;
        Stack<Node> stack = new Stack<>();
        while(cur!=null){
            if (cur.child!=null){
                if (cur.next!=null){
                    stack.push(cur.next);
                }
                cur.next=cur.child;
                if (cur.next!=null){
                    cur.next.prev=cur;
                }
                cur.child=null;
                // no child connection / doubly linkedlist
            }
            else if (cur.next==null && !stack.isEmpty()){
                cur.next=stack.pop();
                if (cur.next!=null){
                    cur.next.prev=cur;
                }
            }
            cur = cur.next;
        }
        return head;
    }
}