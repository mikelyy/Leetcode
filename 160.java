/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /// 技巧的方法 两个连在一起 第一个相同的就是intersection
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null){
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        while (a!=b){
            if (a!=null){
                a=a.next;
            }
            else{
                a=headB;
            }
            if (b!=null){
                b=b.next;
            }
            else{
                b=headA;
            }
        }
        return b;
    }
}