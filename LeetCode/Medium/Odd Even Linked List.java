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
    public ListNode oddEvenList(ListNode head) {
        int i=0;
        ListNode even=new ListNode(0);
        ListNode odd=new ListNode(0);
        ListNode odd1=odd;
        ListNode ans=even;
        while(head!=null){
            if(i%2==0){
                even.next=new ListNode(head.val);
                even=even.next;
            }else{
                odd.next=new ListNode(head.val);
                odd=odd.next;
            }
            head=head.next;
            i++;
        }
        even.next=odd1.next;
        return ans.next;
    }
}
