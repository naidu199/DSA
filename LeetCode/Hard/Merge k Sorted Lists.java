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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        ListNode res=lists[0];

        for(int i=1;i<lists.length;i++){
            res= mergeLists(res,lists[i]);
        }
        return res;
    }


    public ListNode mergeLists(ListNode list1,ListNode list2){
        ListNode head=new ListNode(0);
        ListNode curr=head;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                curr.next=list1;
                list1=list1.next;
            }else{
                curr.next= list2;
                list2=list2.next;
            }
            curr=curr.next;
        }

        curr.next= (list1!=null) ? list1 : list2;

        return head.next;
    }
}
