class Solution {
    static Node constructLL(int arr[]) {
        // code here
        int n=arr.length;
        if(n==0) return null;
        Node head=new Node(arr[0]);
        Node ptr=head;
        for(int i=1;i<n;i++){
            ptr.next=new Node(arr[i]);
            ptr=ptr.next;
        }
        return head;
        
    }
}
