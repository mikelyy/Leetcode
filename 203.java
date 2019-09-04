/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/// ListNode(int x) / ListNode prev=new ListNode(0)是为了head每次会变 所以create新的listnode prev来存储
/// review
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return head;
        }
        ListNode prev=new ListNode(0);
        ListNode curr=prev;
        prev.next=head;
        while (curr.next!=null){
            if (curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return prev.next;
    }
}