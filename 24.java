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
    public ListNode swapPairs(ListNode head) {
        ListNode pointtofirst = new ListNode();
        pointtofirst.next = head;
        ListNode curr = pointtofirst;
        while (head!=null && head.next!=null){
            ListNode first = head;
            ListNode second = head.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = first;
            head = first.next;
        }
        return pointtofirst.next;
    }
}