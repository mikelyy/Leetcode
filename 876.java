/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 /// Method 1
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while (a!=null && a.next!=null){
            b=b.next;
            a=a.next.next;
        }
        return b;
    }
}
