class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        if(head==null || head.next==null) return head;
        Node ptr=head.next;
        Node temp=head;
        while(ptr!=null){
            if (ptr.data == temp.data) {  
                temp.next = ptr.next;  
                if (ptr.next != null) {
                    ptr.next.prev = temp;  
                }
                ptr = ptr.next;  
            } else {
                temp = temp.next;
                ptr = ptr.next;  
            }
        }
        
        return head;
    }
}
