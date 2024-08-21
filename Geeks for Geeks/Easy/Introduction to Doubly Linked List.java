class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node pre=new Node(arr[0]);
        Node cur=pre;
        Node head=pre;
        for(int i=1;i<arr.length;i++){
            cur.next=new Node(arr[i]);
            cur=cur.next;
            cur.prev=pre;
            pre=cur;
        }
        return head;
        
    }
}
