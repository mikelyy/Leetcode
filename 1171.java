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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        int sum=0;
        if (head==null){
            return null;
        }
        ListNode curr = head;
        while (curr!=null){
            sum+=curr.val;
            map.put(sum,curr);
            curr=curr.next;    
        }
        curr = head;
        sum=0;
        while (curr!=null){
            sum+=curr.val;
            if (sum==0){
                head = curr.next;
            }
            else if (map.containsKey(sum)){
                curr.next = map.get(sum).next;
            }
            curr = curr.next;
        }
        return head;
    }
}