/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /// iteratively
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while (current!=null){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }
}


/// review
/// recursively
/// head.next=null / finally point to null
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode a = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return a;
    }
}