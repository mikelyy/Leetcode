/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode curr1=head;
        ListNode curr2=head;
        while (curr2!=null || curr2.next!=null){
            curr1=curr1.next;
            curr2=curr2.next.next;
            if (curr1==curr2){
                return true;
            }
        }
        return false;
    }
}