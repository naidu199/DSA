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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int len=0;
        ListNode ptr = head;
        ListNode temp1=head;
        
        while(ptr.next!=null){
            len++;
            ptr=ptr.next;
        }
        len++;
       
        if(k>len){
            k=k%len;
        }
         if(k==len||k==0){
            return head;
        }
        for(int i=0;i<len-k-1;i++){
            temp1=temp1.next;
        }
        ListNode temp2=temp1.next;
        temp1.next=null;
        ptr.next=head;
        return temp2;

    }
}
