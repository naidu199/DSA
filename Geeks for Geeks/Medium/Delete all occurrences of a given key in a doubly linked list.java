/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node ptr=head;
        Node temp=null;
        while(ptr!=null){
            if(ptr.data==x){
                
                if (ptr == head) {
                    head = ptr.next;  
                }
                if(temp!=null){
                    temp.next=ptr.next;
                }
               if(ptr.next!=null){
                    ptr.next.prev=temp;
               }
                
            }
            else{
                temp=ptr;
            }
            ptr=ptr.next;
        }
        return head;
    }
}
