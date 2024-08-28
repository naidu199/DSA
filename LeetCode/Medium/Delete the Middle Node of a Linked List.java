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
    public ListNode deleteMiddle(ListNode head) {
        ListNode ptr=head;
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null){
            return null;
        }
        while(fast!=null&& fast.next!=null){
            ptr=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ptr.next=ptr.next.next;
        return head;
    }
}
