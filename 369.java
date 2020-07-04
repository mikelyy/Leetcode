/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        int carry=0;
        if (stack.peek().val!=9){
            stack.peek().val+=1;
            return head;
        }
        else{
            stack.pop().val=0;
            carry=1;
            while(!stack.isEmpty()){
                if (stack.peek().val!=9){
                    stack.peek().val+=1;
                    return head;
                }
                else{
                    stack.pop().val=0;
                }
            }
            cur = new ListNode(carry);
            cur.next = head;
        }
        return cur;
    }
}