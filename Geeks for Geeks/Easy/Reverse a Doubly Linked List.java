/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode cur=head;
        DLLNode pre=null;
        DLLNode next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            cur.prev=next;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
