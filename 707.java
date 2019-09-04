class MyLinkedList {
    private ListNode head;
    private int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index>=size || index<0){
            return -1;
        }
        ListNode curr=this.head;
        int count=0;
        while (curr!=null && count<index){
            curr=curr.next;
            count++;
        }
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (this.head==null){
            this.head=new ListNode(val);
        }
        else{
            ListNode curr=this.head;
            this.head=new ListNode(val);
            this.head.next=curr;
        }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (this.head==null){
            this.head=new ListNode(val);
        }
        else{
            ListNode curr=this.head;
            while (curr.next!=null){
                curr=curr.next;
            }
            curr.next=new ListNode(val);
        }
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index>size){
            return;
        }
        else if (index==size){
            this.addAtTail(val);
        }
        else if (index<=0){
            this.addAtHead(val); 
        }
        else{
            int count=0;
            ListNode curr=this.head;
            while (count<index-1){
                curr=curr.next;
                count++;
            }
            ListNode next=curr.next;
            ListNode newNode = new ListNode(val);
            curr.next= newNode;
            newNode.next= next;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index>=size || index<0){
            return;
        }
        else if (index==0){
            if (this.head==null){
                return;
            }
            this.head=this.head.next;
        }
        else{
            ListNode curr=this.head;
            int count=0;
            while (count<index-1){
                curr=curr.next;
                count++;
            }
            curr.next=curr.next.next;
        }
        size--;
    }
    
    private class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */