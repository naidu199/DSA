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
    public ListNode deleteDuplicates(ListNode head) {
        
        
        ListNode list=new ListNode(0,head);

        ListNode ptr=head;
        ListNode p=list;

        while(ptr!=null){
           if(ptr.next!=null&&(ptr.val==ptr.next.val)){
            while(ptr.next!=null&&(ptr.val==ptr.next.val)){
                ptr=ptr.next;
            }
            p.next=ptr.next;
           }else{
            p=p.next;
           }
           ptr=ptr.next;
        }
        return list.next;
    }
}
