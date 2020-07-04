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
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode a_head = a;
        ListNode b_head = b;
        while(head!=null){
            if (head.val<x){
                a_head.next = head;
                a_head = a_head.next;
            }
            else{
                b_head.next=head;
                b_head = b_head.next;
            }
            head = head.next;
        }
        a_head.next = b.next; 
        b_head.next = null;
        return a.next;
    }
}