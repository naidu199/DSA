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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] parts=new ListNode[k];
        int len=0;
        ListNode node=head;

        while(node!=null){
            len++;
            node=node.next;
        }

        int n=len/k, r=len%k;

        node=head;
        ListNode prev=null;
        for(int i=0;node!=null && i<k;i++,r--){
            parts[i]=node;
            for(int j=0;j<n + (r>0?1:0);j++){
                prev=node;
                node=node.next;
            }
            if(prev!=null){
                prev.next=null;
            }
        }
        return parts;
    }
}
