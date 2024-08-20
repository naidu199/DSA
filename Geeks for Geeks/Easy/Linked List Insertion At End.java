class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null)  return new Node(x);
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=new Node(x);
        return head;
    }
}
