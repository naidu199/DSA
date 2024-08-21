class Solution {
    public Node deleteNode(Node head, int x) {
        Node cur=head;
        
        for(int i=1;i<x;i++){
            cur=cur.next;
        }
        
        if(cur.prev==null) {
            return cur.next;
        }
        else{
           cur.prev.next=cur.next; 
        }
        if(cur.next!=null) {
            cur.next.prev=cur.prev;
        }
      
        
        
        
        return head;
    }
}
