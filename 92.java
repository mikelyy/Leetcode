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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode first = head;
        ListNode second = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i=1; i<m; i++){
            prev = first;
            first = first.next;
        }
        for (int j=1; j<n; j++){
            second = second.next;
        }
        while(first!=second){
            prev.next = first.next;
            first.next = second.next;
            second.next = first;
            first = prev.next;
        }
        return dummy.next;
    }
}