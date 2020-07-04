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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = head;
        ListNode temp = null;
        while(cur!=null && cur.next != null){
            if (cur.val<=cur.next.val){
                cur = cur.next;
            }
            else{
                temp = cur.next;
                cur.next = cur.next.next;
                ListNode prev = dummy;
                while(prev.next.val<=temp.val){
                    prev = prev.next;
                }
                temp.next = prev.next;
                prev.next = temp;
            }
        }
        return dummy.next;
    }
}