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
    public int numComponents(ListNode head, int[] G) {
        ListNode cur = head;
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n:G){
            set.add(n);
        }
        while (cur!=null){
            if (set.contains(cur.val) && (cur.next==null || !set.contains(cur.next.val))){
                res++;
            }
            cur = cur.next;
        }
        return res;
    }
}