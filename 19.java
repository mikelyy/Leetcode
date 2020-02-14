/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        int length = 0;
        dummy.next = head;
        ListNode first = head;
        while (first!=null){
            first = first.next;
            length+=1;
        }
        length = length - n;
        first = dummy;
        while (length>0){
            first = first.next;
            length-=1;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}