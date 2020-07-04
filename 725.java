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
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        ListNode temp = root;
        while(temp!=null){
            len+=1;
            temp = temp.next;
        }
        int n = len/k;
        int remainder = len%k;
        ListNode[] res = new ListNode[k];
        temp = root;
        for (int i=0; i<k; i++){
            ListNode head = temp;
            for (int j=0; j<n+(remainder>i ? 1 : 0)-1; j++) {
                if (temp!=null){
                    temp = temp.next;
                }
            }
            if (temp!=null){
                ListNode last = temp;
                temp=temp.next;
                last.next=null;
            }
            res[i] = head;
        }
        return res;
    }
}



